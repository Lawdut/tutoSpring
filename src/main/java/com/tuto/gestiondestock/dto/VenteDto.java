package com.tuto.gestiondestock.dto;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class VenteDto {

    private Integer id;


    private String code;


    private String dateVente;


    private String commentaire;
}
