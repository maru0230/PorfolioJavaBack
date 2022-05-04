
package com.porfoliomdlc.porfolio.service;

import com.porfoliomdlc.porfolio.model.Habilidad;
import java.util.List;


public interface IHabilidadService {
    
    public List<Habilidad> verHabilidad();
    public Habilidad crearHabilidad(Habilidad habilidad);
    public void editarHabilidad(Habilidad habilidad); 
    public void borrarHabilidad(Long id);
    public Habilidad buscarHabilidad(Long id);

    public List<Habilidad> verHabilidades();
    
}
