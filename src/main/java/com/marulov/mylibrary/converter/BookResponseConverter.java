package com.marulov.mylibrary.converter;

import com.marulov.mylibrary.dto.BookResponse;
import com.marulov.mylibrary.model.Book;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookResponseConverter {

    public BookResponse convert(Book book) {
        return BookResponse.builder()
                .id(book.getId())
                .title(book.getTitle())
                .authorName(book.getAuthorName())
                .publisher(book.getPublisher())
                .lastPageNumber(book.getLastPageNumber())
                .totalPage(book.getTotalPage())
                .bookStatus(book.getBookStatus())
                .categoryId(book.getCategory().getId())
                .build();
    }

    public List<BookResponse> convert(List<Book> books) {
        return books.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }
}