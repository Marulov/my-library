package com.marulov.mylibrary.converter;

import com.marulov.mylibrary.dto.BookResponse;
import com.marulov.mylibrary.model.Book;
import org.springframework.stereotype.Component;

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
}