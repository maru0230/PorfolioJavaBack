
package com.porfoliomdlc.porfolio.repository;

import com.porfoliomdlc.porfolio.model.Acerca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcercaRepository extends JpaRepository<Acerca,Long> {
    
}
