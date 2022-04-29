
package com.porfoliomdlc.porfolio.service;

import com.porfoliomdlc.porfolio.model.Acerca;
import java.util.List;


public interface IAcercaService {
    
    public List<Acerca> verAcerca();
    public void crearAcerca(Acerca acerca);
    public void editarAcerca(Acerca acerca); 
    public void borrarAcerca(Long id);
    public Acerca buscarAcerca(Long id);

    public List<Acerca> verAcercas();

       
}
