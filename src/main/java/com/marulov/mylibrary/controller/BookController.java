package com.marulov.mylibrary.controller;

import com.amazonaws.services.waf.model.HTTPRequest;
import com.marulov.mylibrary.dto.BookResponse;
import com.marulov.mylibrary.dto.SaveBookRequest;
import com.marulov.mylibrary.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
