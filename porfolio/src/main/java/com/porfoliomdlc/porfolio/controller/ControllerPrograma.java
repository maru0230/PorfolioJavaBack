
package com.porfoliomdlc.porfolio.controller;

import com.porfoliomdlc.porfolio.model.Programa;
import com.porfoliomdlc.porfolio.service.IProgramaService;
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
public class ControllerPrograma {
    
    @Autowired
    private IProgramaService programaServ;
    
    @PostMapping("/new/programa")
    @ResponseBody
        public Programa agregarPrograma(@RequestBody Programa programa){
         return programaServ.crearPrograma(programa);
    }
    
    
    @GetMapping ("/ver/programa")
    @ResponseBody
    public List<Programa> verPrograma(){
        return programaServ.verPrograma();
    
    }
    
    @DeleteMapping("/delete4/{id}")
    public void borrarPrograma(@PathVariable Long id){
        programaServ.borrarPrograma(id);
    }
    
    @PutMapping("/editar/programa")
    public void editarPrograma(@RequestBody Programa programa){
        programaServ.editarPrograma(programa);
         
    }
    
    
}

    

