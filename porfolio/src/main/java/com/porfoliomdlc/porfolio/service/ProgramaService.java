
package com.porfoliomdlc.porfolio.service;

import com.porfoliomdlc.porfolio.model.Programa;
import com.porfoliomdlc.porfolio.repository.ProgramaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramaService implements IProgramaService {
    @Autowired
    public ProgramaRepository programaRepo;

    @Override
    public List<Programa> verPrograma() {
        return programaRepo.findAll();
    }

    @Override
    public Programa crearPrograma(Programa programa) {
        return programaRepo.save(programa);
    }

    @Override
    public void editarPrograma(Programa programa) {
        programaRepo.save(programa);
    }

    @Override
    public void borrarPrograma(Long id) {
        programaRepo.deleteById(id);
    }

    @Override
    public Programa buscarPrograma(Long id) {
        return programaRepo.findById(id).orElse(null);
    }

    @Override
    public List<Programa> verProgramas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
