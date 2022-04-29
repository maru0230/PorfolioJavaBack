
package com.porfoliomdlc.porfolio.controller;

import com.porfoliomdlc.porfolio.model.Persona;
import com.porfoliomdlc.porfolio.service.IPersonaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService persoServ;
    @PostMapping("/new/persona")
        public void agregarPersona(@RequestBody Persona pers){
         persoServ.crearPersona(pers);
    }
    
    
    @GetMapping ("/ver/persona")
    @ResponseBody
    public List<Persona> verPersona(){
        return persoServ.verPersona();
    
    }
    
    @DeleteMapping("/delete/{id}")
    public void borrarPersona(@PathVariable Long id){
        persoServ.borrarPersona(id);
    }
    
    @PutMapping("/editar/persona")
    public void editarPersona(@RequestBody Persona pers){
        persoServ.editarPersona(pers);
         
    }
    
    }
