
package com.porfoliomdlc.porfolio.repository;

import com.porfoliomdlc.porfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
}
