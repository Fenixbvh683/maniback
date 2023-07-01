
package com.manidela.manidelasprin.service;

import com.manidela.manidelasprin.model.Persona;
import java.util.List;


public interface ISPersona {
    
    public List<Persona> verPersona();
    
    public void crearPersona (Persona per);
    
    public void borrarPersona (Long id);
    
    public Persona buscarPersona(Long id);
}
