
package com.porfoliomdlc.porfolio.service;

import com.porfoliomdlc.porfolio.model.Acerca;
import com.porfoliomdlc.porfolio.repository.AcercaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaService implements IAcercaService {
    @Autowired
    public AcercaRepository acercaRepo;

    @Override
    public List<Acerca> verAcerca() {
        return acercaRepo.findAll();
    }

    @Override
    public void crearAcerca(Acerca acerca) {
        acercaRepo.save(acerca);
    }

    @Override
    public void editarAcerca(Acerca acerca) {
        acercaRepo.save(acerca);
    }

    @Override
    public void borrarAcerca(Long id) {
        acercaRepo.deleteById(id);
    }

    @Override
    public Acerca buscarAcerca(Long id) {
       return acercaRepo.findById(id).orElse(null); 
    }

    @Override
    public List<Acerca> verAcercas() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
    
}
