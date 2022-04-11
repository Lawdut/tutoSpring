package com.tuto.gestiondestock.dto;

import com.tuto.gestiondestock.model.Article;
import com.tuto.gestiondestock.model.TypeMvtStk;
import lombok.Builder;
import lombok.Data;


import java.time.Instant;

@Builder
@Data
public class MvtStkDto {

    private Integer id;

    private ArticleDto article;


    private Instant dateMvt;


    private Instant quantite;


    private TypeMvtStkDto typeMvt;

}
