
package com.porfoliomdlc.porfolio.service;

import com.porfoliomdlc.porfolio.model.Estudios;
import com.porfoliomdlc.porfolio.repository.EstudiosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudiosService implements IEstudiosService {

    @Autowired
    public EstudiosRepository estRepo;
    
    @Override
    public List<Estudios> verEstudios() {
        return estRepo.findAll();
    }

    @Override
    public void crearEstudios(Estudios est) {
        estRepo.save(est);
    }

    @Override
    public void borrarEstudios(Long id) {
        estRepo.deleteById(id);
    }

    @Override
    public Estudios buscarEstudios(Long id) {
        return estRepo.findById(id).orElse(null);
    }
    
    @Override
    public void editarEstudios(Estudios est) {
        estRepo.save(est);
    }
    
}
