package com.tuto.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name ="mvtstk")
public class MvtStk extends AbstractEntity{

    @ManyToOne
    @JoinColumn(name="idarticle")
    private Article article;

    @Column(name="datemvt")
    private Instant dateMvt;

    @Column(name="quantite")
    private Instant quantite;

    @Column(name="typemvt")
    private TypeMvtStk typeMvt;

}
