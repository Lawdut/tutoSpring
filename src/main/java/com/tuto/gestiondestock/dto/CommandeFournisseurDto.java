package com.tuto.gestiondestock.dto;

import com.tuto.gestiondestock.model.Fournisseur;
import com.tuto.gestiondestock.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;


import java.time.Instant;
import java.util.List;

@Builder
@Data
public class CommandeFournisseurDto {

    private Integer id;


    private String code;


    private Instant dateCommande;


    private FournisseurDto fournisseur;


    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseur;
}
