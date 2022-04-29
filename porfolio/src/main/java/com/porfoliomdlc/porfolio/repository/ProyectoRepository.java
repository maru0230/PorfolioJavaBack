
package com.porfoliomdlc.porfolio.repository;

import com.porfoliomdlc.porfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
    
}
