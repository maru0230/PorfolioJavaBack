
package com.porfoliomdlc.porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Acerca {
     @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String texto;

    public Acerca() {
    }

    public Acerca(Long id, String texto) {
        this.id = id;
        this.texto = texto;
    }
    
    
    
}
