package com.marulov.mylibrary.dto;

import com.marulov.mylibrary.model.BookStatus;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class BookResponse {
    private Long id;
    private String title;
    private String authorName;
    private String publisher;
    private Integer lastPageNumber;
    private Integer totalPage;
    private BookStatus bookStatus;
    private Long categoryId;
}