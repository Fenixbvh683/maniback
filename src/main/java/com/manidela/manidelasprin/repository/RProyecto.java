
package com.manidela.manidelasprin.repository;

import com.manidela.manidelasprin.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyecto extends JpaRepository<Proyecto, Long>{
    
}
