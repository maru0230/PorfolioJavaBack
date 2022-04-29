
package com.porfoliomdlc.porfolio.service;

import com.porfoliomdlc.porfolio.model.Idioma;
import java.util.List;


public interface IIdiomaService {
    
    public List<Idioma> verIdioma();
    public void crearIdioma(Idioma idioma);
    public void editarIdioma(Idioma idioma); 
    public void borrarIdioma(Long id);
    public Idioma buscarIdioma(Long id);

    public List<Idioma> verIdiomas();
    
}
