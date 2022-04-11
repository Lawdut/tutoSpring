package com.tuto.gestiondestock.dto;

import com.tuto.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class RolesDto {

    private Integer id;

    private String roleName;


    private UtilisateurDto utilisateur;

}
