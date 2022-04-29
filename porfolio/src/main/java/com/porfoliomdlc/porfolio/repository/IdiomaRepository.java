
package com.porfoliomdlc.porfolio.repository;

import com.porfoliomdlc.porfolio.model.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomaRepository extends JpaRepository<Idioma, Long> {
    
}
