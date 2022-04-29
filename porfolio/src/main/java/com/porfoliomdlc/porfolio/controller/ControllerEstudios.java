
package com.porfoliomdlc.porfolio.controller;

import com.porfoliomdlc.porfolio.model.Estudios;
import com.porfoliomdlc.porfolio.service.IEstudiosService;
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
public class ControllerEstudios {
    
    @Autowired
    private IEstudiosService estServ;
    
    @PostMapping("/new/estudios")
    @ResponseBody
    public void agregarEstudios (@RequestBody Estudios est){
         estServ.crearEstudios(est);
    }
    
     @PutMapping("/editar/estudios")
    public void editarEstudios(@RequestBody Estudios est){
        estServ.editarEstudios(est);
         
    }
    
    @GetMapping ("/ver/estudios")
    @ResponseBody
    public List<Estudios> verEstudios(){
        return estServ.verEstudios();
    }
    
    @DeleteMapping("/borrar/{id}")
    public void borrarEstudios (@PathVariable Long id){
        estServ.borrarEstudios(id);
    }
    
   
}
