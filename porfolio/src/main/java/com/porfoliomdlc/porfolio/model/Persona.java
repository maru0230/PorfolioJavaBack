
package com.porfoliomdlc.porfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String image;
    private String position;
    private String ubication;
    private String company;
    private String img;
    private String url;
    private String school;
    private String img2;
    private String url2;
    

    public Persona() {
    }

    public Persona(Long id, String name, String image, String position, String ubication, String company, String img, String url, String school, String img2, String url2) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.position = position;
        this.ubication = ubication;
        this.company = company;
        this.img = img;
        this.url = url;
        this.school = school;
        this.img2 = img2;
        this.url2 = url2;
    }

   
    

     
}
