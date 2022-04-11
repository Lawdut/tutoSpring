package com.tuto.gestiondestock.dto;

import com.tuto.gestiondestock.model.Adresse;
import com.tuto.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class EntrepriseDto {

    private Integer id;


    private String nom;


    private String description;


    private AdresseDto adresse;


    private String codeFiscal;


    private String photo;


    private String mail;


    private String numTel;


    private String siteWeb;


    private List<UtilisateurDto> utilisateurs;
}
