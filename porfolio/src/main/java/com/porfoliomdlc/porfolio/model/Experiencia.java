
package com.porfoliomdlc.porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private Long id;
    private String position;
    private String company;
    private String img;
    private String mode;
    private String start;
    private String end;
    private String timeElapsed;

    public Experiencia() {
    }

    public Experiencia(Long id, String position, String company, String img, String mode, String start, String end, String timeElapsed) {
        this.id = id;
        this.position = position;
        this.company = company;
        this.img = img;
        this.mode = mode;
        this.start = start;
        this.end = end;
        this.timeElapsed = timeElapsed;
    }
    
}
