
package com.porfoliomdlc.porfolio.service;

import com.porfoliomdlc.porfolio.model.Programa;
import java.util.List;


public interface IProgramaService {
    
    public List<Programa> verPrograma();
    public void crearPrograma(Programa programa);
    public void editarPrograma(Programa programa); 
    public void borrarPrograma(Long id);
    public Programa buscarPrograma(Long id);

    public List<Programa> verProgramas();
}
