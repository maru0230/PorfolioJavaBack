
package com.porfoliomdlc.porfolio.service;

import com.porfoliomdlc.porfolio.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> verProyecto();
    public Proyecto crearProyecto(Proyecto proyecto);
    public void editarProyecto(Proyecto proyecto); 
    public void borrarProyecto(Long id);
    public Proyecto buscarProyecto(Long id);

    public List<Proyecto> verProyectos();
    
    
}
