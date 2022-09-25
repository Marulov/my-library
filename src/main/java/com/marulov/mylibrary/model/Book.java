package com.marulov.mylibrary.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "books")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Book extends BaseEntity {

    private String title;
    private String authorName;
    private String publisher;
    private Integer lastPageNumber;

    @Enumerated(EnumType.STRING)
    private BookStatus bookStatus;

    @OneToOne
    private Image image;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}