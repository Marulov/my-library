package com.marulov.mylibrary.service;

import com.marulov.mylibrary.converter.BookResponseConverter;
import com.marulov.mylibrary.dto.BookResponse;
import com.marulov.mylibrary.dto.CategoryType;
import com.marulov.mylibrary.dto.SaveBookRequest;
import com.marulov.mylibrary.model.Book;
import com.marulov.mylibrary.model.BookStatus;
import com.marulov.mylibrary.model.Category;
import com.marulov.mylibrary.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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

    public List<BookResponse> getAll() {
        return bookResponseConverter.convert(bookRepository.findAll());
    }

    public List<BookResponse> getAllByCategoryId(Long categoryId) {
        return bookResponseConverter.convert(bookRepository.findAllByCategoryId(categoryId).orElseThrow(
                () -> new RuntimeException("Category id not found")));
    }

    public List<BookResponse> getAllByBookStatus(BookStatus bookStatus) {
        return bookResponseConverter.convert(bookRepository.findAllByBookStatus(bookStatus).orElseThrow(
                () -> new RuntimeException("Book status not found")));
    }

    public List<BookResponse> getAllByCategoryName(CategoryType categoryType) {
        return bookResponseConverter.convert(bookRepository.findAllByCategoryName(categoryType.getValue()).orElseThrow(
                () -> new RuntimeException("Category name not found")));
    }
}