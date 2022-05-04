
package com.porfoliomdlc.porfolio.controller;

import com.porfoliomdlc.porfolio.model.Proyecto;
import com.porfoliomdlc.porfolio.service.IProyectoService;
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
public class ControllerProyecto {
    
     @Autowired
    private IProyectoService proyectoServ;
    @PostMapping("/new/proyecto")
     @ResponseBody
        public Proyecto agregarProyecto(@RequestBody Proyecto proyecto){
         return proyectoServ.crearProyecto(proyecto);
    }
    
    
    @GetMapping ("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto(){
        return proyectoServ.verProyecto();
    
    }
    
    @DeleteMapping("/delete5/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proyectoServ.borrarProyecto(id);
    }
    
    @PutMapping("/editar/proyecto")
    public void editarProyecto(@RequestBody Proyecto proyecto){
        proyectoServ.editarProyecto(proyecto);
         
    }
    
    
    
}
