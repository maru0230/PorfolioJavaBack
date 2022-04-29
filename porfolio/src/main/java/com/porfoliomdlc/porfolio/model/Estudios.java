
package com.porfoliomdlc.porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;



@Getter @Setter
@Entity
public class Estudios {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String school;
     private String title;
    private String img;
    private String career;
    private String start;
    private String end;

    public Estudios() {
    }

    public Estudios(Long id, String school, String title, String img, String career, String start, String end) {
        this.id = id;
        this.school = school;
        this.title = title;
        this.img = img;
        this.career = career;
        this.start = start;
        this.end = end;
    }
    
    
    
}
