package com.tuto.gestiondestock.dto;

import com.tuto.gestiondestock.model.Article;
import com.tuto.gestiondestock.model.Category;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.stream.Collectors;

@Builder
@Data
public class ArticleDto {

    private Integer id;


    private String codeArticle;


    private String designation;


    private BigDecimal prixUnitaire;


    private BigDecimal tauxTva;


    private BigDecimal prixUnitaireTtc;


    private String photo;


    private CategoryDto category;


    public ArticleDto fromEntity(Article article){
        if(article == null){
            return null;
        }

        return ArticleDto.builder()
                .id(article.getId())
                .codeArticle(article.getCodeArticle())
                .designation(article.getDesignation())
                .prixUnitaire(article.getPrixUnitaire())
                .tauxTva(article.getTauxTva())
                .prixUnitaire(article.getPrixUnitaire())
                .category(CategoryDto.fromEntity(article.getCategory()))
                .prixUnitaireTtc(article.getPrixUnitaireTtc())
                .build();
    }

    public Article toEntity(ArticleDto articleDto){
        if(articleDto == null) {
            return null;

        }
        Article article = new Article();
        article.setId(articleDto.getId());
        article.setCodeArticle(articleDto.getCodeArticle());
        article.setDesignation(articleDto.getDesignation());
        article.setPrixUnitaire(articleDto.getPrixUnitaire());
        article.setTauxTva(articleDto.getTauxTva());
        article.setPrixUnitaireTtc(articleDto.getPrixUnitaireTtc());
        article.setCategory(CategoryDto.toEntity(articleDto.getCategory()));

        return article;
    }
}
