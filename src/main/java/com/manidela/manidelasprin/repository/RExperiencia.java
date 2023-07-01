
package com.manidela.manidelasprin.repository;

import com.manidela.manidelasprin.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RExperiencia extends JpaRepository <Experiencia, Long>{
    
}
