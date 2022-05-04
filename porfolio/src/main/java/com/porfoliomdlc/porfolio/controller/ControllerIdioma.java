
package com.porfoliomdlc.porfolio.controller;

import com.porfoliomdlc.porfolio.model.Idioma;
import com.porfoliomdlc.porfolio.service.IIdiomaService;
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
public class ControllerIdioma {
    
     @Autowired
    private IIdiomaService idiomaServ;
    @PostMapping("/new/idioma")
     @ResponseBody
        public Idioma agregarIdioma(@RequestBody Idioma idioma){
        return idiomaServ.crearIdioma(idioma);
    }
    
    
    @GetMapping ("/ver/idioma")
    @ResponseBody
    public List<Idioma> verIdioma(){
        return idiomaServ.verIdioma();
    
    }
    
    @DeleteMapping("/delete3/{id}")
    public void borrarIdioma(@PathVariable Long id){
        idiomaServ.borrarIdioma(id);
    }
    
    @PutMapping("/editar/idioma")
    public void editarIdioma(@RequestBody Idioma idioma){
        idiomaServ.editarIdioma(idioma);
         
    }
    
    
}
