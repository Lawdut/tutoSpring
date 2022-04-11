package com.tuto.gestiondestock.dto;

import com.tuto.gestiondestock.model.Adresse;
import com.tuto.gestiondestock.model.Category;
import com.tuto.gestiondestock.model.Client;
import com.tuto.gestiondestock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;


import java.util.List;

@Data
@Builder
public class ClientDto {


    private String nom;


    private String prenom;


    private AdresseDto adresse;


    private String photo;


    private String mail;


    private String numTel;

    private List<CommandeClientDto> commandeClients;


    public ClientDto fromEntity(Client Client) {
        if(category == null){
            //TODO throw an exception
            return null;
        }

        return ClientDto.builder()
                .id(Client.getId())
                .nom(Client.getNom())
                .prenom(Client.getPrenom())
                .AdresseDto(AdresseDto.getAdresse())
                .build();
    }

    public Category toEntity(CategoryDto categoryDto){
        if(categoryDto == null){
            //TODO throw an exception
            return null;
        }

        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setCodeArticle(categoryDto.getCodeArticle());
        category.setDesignation((categoryDto.getDesignation()));

        return category;
    }
}
