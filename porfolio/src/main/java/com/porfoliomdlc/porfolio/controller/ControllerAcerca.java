
package com.porfoliomdlc.porfolio.controller;

import com.porfoliomdlc.porfolio.model.Acerca;
import com.porfoliomdlc.porfolio.service.IAcercaService;
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
public class ControllerAcerca {
    
    
    @Autowired
    private IAcercaService acercaServ;
    @PostMapping("/new/acerca")
        public void agregarAcerca(@RequestBody Acerca acerca){
         acercaServ.crearAcerca(acerca);
    }
        
    @GetMapping ("/ver/acerca")
    @ResponseBody
    public List<Acerca> verAcerca(){
        return acercaServ.verAcerca();
    
    }
    
    @DeleteMapping("/anular/{id}")
    public void borrarAcerca(@PathVariable Long id){
        acercaServ.borrarAcerca(id);
    }
    
    @PutMapping("/editar/acerca")
    public void editarAcerca(@RequestBody Acerca acerca){
        acercaServ.editarAcerca(acerca);
         
    }
    
}
