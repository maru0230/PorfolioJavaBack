
package com.porfoliomdlc.porfolio.controller;


import com.porfoliomdlc.porfolio.model.Experiencia;
import com.porfoliomdlc.porfolio.service.IExperienciaService;
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
public class ControllerExperiencia {
    
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping("/new/experiencia")
    public void agregarExperiencia (@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return expServ.verExperiencia();
    }
    
    @DeleteMapping("/eliminar/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    
     @PutMapping("/editar/experiencia")
    public void editarExperiencia(@RequestBody Experiencia exp){
        expServ.editarExperiencia(exp);
         
    }
}
