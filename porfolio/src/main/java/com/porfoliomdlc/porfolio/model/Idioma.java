
package com.porfoliomdlc.porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Idioma {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
     private Long id;
     private String idioma;
     private Long porcentaje;
     private String valor;

    public Idioma(Long id, String idioma, Long porcentaje, String valor) {
        this.id = id;
        this.idioma = idioma;
        this.porcentaje = porcentaje;
        this.valor = valor;
    }

    public Idioma() {
    }

    
     
     
    
}
