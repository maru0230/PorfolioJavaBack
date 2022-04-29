
package com.porfoliomdlc.porfolio.repository;

import com.porfoliomdlc.porfolio.model.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiosRepository extends JpaRepository <Estudios, Long>{
    
}
