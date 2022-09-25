package com.marulov.mylibrary.controller;

import com.marulov.mylibrary.dto.BookResponse;
import com.marulov.mylibrary.dto.SaveBookRequest;
import com.marulov.mylibrary.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    public ResponseEntity<BookResponse> save(@RequestBody SaveBookRequest request) {
        bookService.save(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<BookResponse>> getAll() {
        return ResponseEntity.ok(bookService.getAll());
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<List<BookResponse>> getAllByCategoryId(@PathVariable Long categoryId) {
        return ResponseEntity.ok(bookService.getAllByCategoryId(categoryId));
    }
}
