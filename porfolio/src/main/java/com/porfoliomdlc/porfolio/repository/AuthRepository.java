
package com.porfoliomdlc.porfolio.repository;

import com.porfoliomdlc.porfolio.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthRepository extends JpaRepository <Usuario, Long> {
    List<Usuario>findByEmailAndIsEnabledTrue(String email);
}
