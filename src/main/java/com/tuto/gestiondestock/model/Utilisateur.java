package com.tuto.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="utlisateur")
public class Utilisateur extends AbstractEntity{

    @Column(name="nom")
    private String nom;

    @Column(name="prenom")
    private String prenom;

    @Column(name="datedenaissance")
    private String dateDeNaissance;

    @Column(name="motdepasse")
    private String motDePasse;
    @Embedded
    private Adresse adresse;

    @Column(name="mail")
    private String mail;

    @ManyToOne
    @JoinColumn(name="identreprise")
    private Entreprise entreprise;

    @OneToMany
    private List<Roles> roles;

}
