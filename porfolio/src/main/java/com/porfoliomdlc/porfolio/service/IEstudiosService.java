
package com.porfoliomdlc.porfolio.service;

import com.porfoliomdlc.porfolio.model.Estudios;
import java.util.List;


public interface IEstudiosService {
    
    public List<Estudios> verEstudios();
    public Estudios crearEstudios (Estudios est);
    public void borrarEstudios (Long id);
    public Estudios buscarEstudios (Long id);

    public void editarEstudios(Estudios est);
    
}
