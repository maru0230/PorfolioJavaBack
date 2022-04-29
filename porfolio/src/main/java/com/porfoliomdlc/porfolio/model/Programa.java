
package com.porfoliomdlc.porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Programa {
     @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
     private Long id;
     private String categoria;
     private Long porcentaje;
     private String categro;
    private String valorynombre;

    public Programa() {
    }

    public Programa(Long id, String categoria, Long porcentaje, String valorynombre) {
        this.id = id;
        this.categoria = categoria;
        this.porcentaje = porcentaje;
        this.valorynombre = valorynombre;
    }
     
     
    
}
