
package com.porfoliomdlc.porfolio.service;

import com.porfoliomdlc.porfolio.model.Idioma;
import com.porfoliomdlc.porfolio.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomaService implements IIdiomaService {
    
    @Autowired
    public IdiomaRepository idiomaRepo;

    @Override
    public List<Idioma> verIdioma() {
        return idiomaRepo.findAll();
    }

    @Override
    public void crearIdioma(Idioma idioma) {
        idiomaRepo.save(idioma);
    }

    @Override
    public void editarIdioma(Idioma idioma) {
        idiomaRepo.save(idioma);
    }

    @Override
    public void borrarIdioma(Long id) {
        idiomaRepo.deleteById(id);
    }

    @Override
    public Idioma buscarIdioma(Long id) {
        return idiomaRepo.findById(id).orElse(null);
    }

    @Override
    public List<Idioma> verIdiomas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
}
