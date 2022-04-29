
package com.porfoliomdlc.porfolio.repository;

import com.porfoliomdlc.porfolio.model.Programa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProgramaRepository extends JpaRepository<Programa, Long> {
    
}
