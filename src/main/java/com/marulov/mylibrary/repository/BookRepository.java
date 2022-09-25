package com.marulov.mylibrary.repository;

import com.marulov.mylibrary.model.Book;
import com.marulov.mylibrary.model.BookStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {
    Optional<List<Book>> findAllByCategoryId(Long categoryId);

    Optional<List<Book>> findAllByCategoryName(String categoryType);

    Optional<List<Book>> findAllByBookStatus(BookStatus bookStatus);
}
