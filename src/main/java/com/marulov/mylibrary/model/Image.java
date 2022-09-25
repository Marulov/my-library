package com.marulov.mylibrary.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "images")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Image extends BaseEntity {
    private String imageUrl;
}