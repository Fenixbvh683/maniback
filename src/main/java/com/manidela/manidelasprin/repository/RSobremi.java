
package com.manidela.manidelasprin.repository;

import com.manidela.manidelasprin.model.Sobremi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSobremi extends JpaRepository <Sobremi, Long>{
    
}
