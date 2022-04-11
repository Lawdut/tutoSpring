package com.tuto.gestiondestock.dto;

import com.tuto.gestiondestock.model.Adresse;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;

@Builder
@Data
public class AdresseDto {

    private Integer id;

    private String adresse1;

    private String adresse2;

    private String ville;

    private String codePostale;

    private String pays;


    public AdresseDto fromEntity(Adresse adresse){
        if(adresse == null){
            return null;
        }

        return AdresseDto.builder()
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .ville(adresse.getVille())
                .codePostale(adresse.getCodePostale())
                .pays(adresse.getPays())
                .build();
    }

    public Adresse toEntity(AdresseDto adresseDto){
        if(adresseDto == null) {
            return null;

        }
        Adresse adresse = new Adresse();
        adresse.setId(adresseDto.getId());
        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setVille(adresseDto.getVille());
        adresse.setCodePostale(adresseDto.getCodePostale());
        adresse.setPays(adresseDto.getPays());

        return adresse;
    }
}
