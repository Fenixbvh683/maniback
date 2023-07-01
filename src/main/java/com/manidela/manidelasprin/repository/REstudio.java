
package com.manidela.manidelasprin.repository;

import com.manidela.manidelasprin.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REstudio extends JpaRepository <Estudio, Long>{
    
}
