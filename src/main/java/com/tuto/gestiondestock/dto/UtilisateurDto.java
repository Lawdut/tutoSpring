package com.tuto.gestiondestock.dto;

import com.tuto.gestiondestock.model.Adresse;
import com.tuto.gestiondestock.model.Entreprise;
import com.tuto.gestiondestock.model.Roles;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;


@Builder
@Data
public class UtilisateurDto {

    private Integer id;

    private String nom;


    private String prenom;


    private String dateDeNaissance;


    private String motDePasse;

    private Adresse adresse;


    private String mail;


    private EntrepriseDto entreprise;


    private List<RolesDto> roles;

                .category(article.getCategory() != null ?
            article.getCategory().stream()
                                .map(CategoryDto::fromEntity)
                                .collect(Collectors.toList()) : null)
}
