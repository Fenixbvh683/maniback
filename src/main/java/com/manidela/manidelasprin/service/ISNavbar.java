
package com.manidela.manidelasprin.service;

import com.manidela.manidelasprin.model.Navbar;
import java.util.List;


public interface ISNavbar {
    
    public List<Navbar> verNavbar();
    
    public void crearNavbar (Navbar nav);
    
    public void borrarNavbar (Long idnav);
    
    public Navbar buscarNavbar(Long idnav);
    
}
