package com.tuto.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="vente")
public class Vente extends AbstractEntity{


    @Column(name="code")
    private String code;

    @Column(name="datevente")
    private String dateVente;

    @Column(name="commentaire")
    private String commentaire;

}
