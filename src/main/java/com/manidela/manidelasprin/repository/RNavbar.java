
package com.manidela.manidelasprin.repository;

import com.manidela.manidelasprin.model.Navbar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RNavbar extends JpaRepository <Navbar, Long>{
    
}
