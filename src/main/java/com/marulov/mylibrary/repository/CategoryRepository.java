package com.marulov.mylibrary.repository;

import com.marulov.mylibrary.model.Book;
import com.marulov.mylibrary.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CategoryRepository extends JpaRepository<Category, Long>, JpaSpecificationExecutor<Book> {
}
