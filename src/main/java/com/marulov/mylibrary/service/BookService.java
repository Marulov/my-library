package com.marulov.mylibrary.service;

import com.marulov.mylibrary.converter.BookResponseConverter;
import com.marulov.mylibrary.dto.BookResponse;
import com.marulov.mylibrary.dto.SaveBookRequest;
import com.marulov.mylibrary.model.Book;
import com.marulov.mylibrary.model.Category;
import com.marulov.mylibrary.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;
    private final CategoryService categoryService;

    private final BookResponseConverter bookResponseConverter;

    @Transactional
    public BookResponse save(SaveBookRequest request) {
        Category category = categoryService.getById(request.getCategoryId());
        Book book = Book.builder()
                .title(request.getTitle())
                .authorName(request.getAuthorName())
                .publisher(request.getPublisher())
                .lastPageNumber(request.getLastPageNumber())
                .totalPage(request.getTotalPage())
                .bookStatus(request.getBookStatus())
                .category(category)
                .build();
        return bookResponseConverter.convert(bookRepository.save(book));
    }
}