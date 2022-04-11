package com.tuto.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tuto.gestiondestock.model.Article;
import com.tuto.gestiondestock.model.Category;
import lombok.Builder;
import lombok.Data;

import java.util.List;


@Builder
@Data
public class CategoryDto {

    private Integer id;

    private String codeArticle;

    private String designation;

    @JsonIgnore
    private List<ArticleDto> articles;

    public static CategoryDto fromEntity(Category category) {
        if(category == null){
            //TODO throw an exception
            return null;
        }

        return CategoryDto.builder()
                .id(category.getId())
                .codeArticle(category.getCodeArticle())
                .designation(category.getDesignation())
                .build();
    }

    public static Category toEntity(CategoryDto categoryDto){
        if(categoryDto == null){
            //TODO throw an exception
            return null;
        }

        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCodeArticle(categoryDto.getCodeArticle());
        category.setDesignation(categoryDto.getDesignation());

        return category;
        }
}

