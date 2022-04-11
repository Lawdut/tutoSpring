package com.tuto.gestiondestock.dto;

import com.tuto.gestiondestock.model.Article;
import com.tuto.gestiondestock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class LigneCommandeClientDto {

    private Integer id;

    private ArticleDto article;

    private CommandeClientDto commandeClient;


}
