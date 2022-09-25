package com.marulov.mylibrary.dto;

import com.marulov.mylibrary.model.BookStatus;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.File;

@Data
public class SaveBookRequest {

    @NotBlank
    private String title;
    @NotBlank
    private String authorName;
    @NotBlank
    private String publisher;
    @NotBlank
    private Integer lastPageNumber;
    @NotBlank
    private Integer totalPage;
    @NotBlank
    private BookStatus bookStatus;
    private File image;
    @NotBlank
    private Long categoryId;
}