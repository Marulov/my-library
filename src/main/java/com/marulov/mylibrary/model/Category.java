package com.marulov.mylibrary.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category extends BaseEntity {

    private String name;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private List<Book> books;
}