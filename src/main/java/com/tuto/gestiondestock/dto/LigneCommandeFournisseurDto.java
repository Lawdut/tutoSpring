package com.tuto.gestiondestock.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LigneCommandeFournisseurDto {

    private Integer id;

    private ArticleDto article;


    private CommandeFournisseurDto commandeFournisseur;

}
