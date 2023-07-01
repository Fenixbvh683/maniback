
package com.manidela.manidelasprin.repository;

import com.manidela.manidelasprin.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RHabilidad extends JpaRepository <Habilidad, Long>{
    
}
