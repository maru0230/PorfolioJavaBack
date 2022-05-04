
package com.porfoliomdlc.porfolio.service;

import com.porfoliomdlc.porfolio.model.Habilidad;
import com.porfoliomdlc.porfolio.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadService implements IHabilidadService {
    
    @Autowired
    public HabilidadRepository habilidadRepo;

    @Override
    public List<Habilidad> verHabilidad() {
        return habilidadRepo.findAll();
    }

    @Override
    public Habilidad crearHabilidad(Habilidad habilidad) {
        return habilidadRepo.save(habilidad);
    }

    @Override
    public void editarHabilidad(Habilidad habilidad) {
        habilidadRepo.save(habilidad);
    }

    @Override
    public void borrarHabilidad(Long id) {
        habilidadRepo.deleteById(id);
    }

    @Override
    public Habilidad buscarHabilidad(Long id) {
        return habilidadRepo.findById(id).orElse(null);
    }

    @Override
    public List<Habilidad> verHabilidades() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
