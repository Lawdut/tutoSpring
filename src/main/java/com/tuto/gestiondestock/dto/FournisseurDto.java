package com.tuto.gestiondestock.dto;

import com.tuto.gestiondestock.model.Adresse;
import com.tuto.gestiondestock.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;


import java.util.List;

@Builder
@Data
public class FournisseurDto {

    private Integer id;

    private String nom;


    private String prenom;


    private Adresse adresse;


    private String photo;


    private String mail;


    private String numTel;


    private List<CommandeFournisseur> commandeFournisseurs;

}
