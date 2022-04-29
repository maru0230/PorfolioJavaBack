
package com.porfoliomdlc.porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String descripcion;

    public Proyecto() {
    }

    public Proyecto(Long id, String name, String descripcion) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
    }
    
     
}
