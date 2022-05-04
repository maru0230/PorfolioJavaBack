
package com.porfoliomdlc.porfolio.controller;

import com.porfoliomdlc.porfolio.model.Habilidad;
import com.porfoliomdlc.porfolio.service.IHabilidadService;
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
public class ControllerHabilidad {
    
    @Autowired
    private IHabilidadService habilidadServ;
    @PostMapping("/new/habilidad")
        public Habilidad agregarHabilidad(@RequestBody Habilidad habilidad){
        return habilidadServ.crearHabilidad(habilidad);
    }
    
    
    @GetMapping ("/ver/habilidad")
    @ResponseBody
    public List<Habilidad> verHabilidad(){
        return habilidadServ.verHabilidad();
    
    }
    
    @DeleteMapping("/delete2/{id}")
    public void borrarHabilidad(@PathVariable Long id){
        habilidadServ.borrarHabilidad(id);
    }
    
    @PutMapping("/editar/habilidad")
    public void editarHabilidad(@RequestBody Habilidad habilidad){
        habilidadServ.editarHabilidad(habilidad);
         
    }
    
    
}
