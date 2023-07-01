
package com.manidela.manidelasprin.repository;

import com.manidela.manidelasprin.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository <Persona, Long>{
    
}
