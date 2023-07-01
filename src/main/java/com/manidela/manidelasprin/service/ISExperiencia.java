
package com.manidela.manidelasprin.service;

import com.manidela.manidelasprin.model.Experiencia;
import java.util.List;


public interface ISExperiencia {
    
    public List<Experiencia> verExperiencia();
    
    public void crearExperiencia (Experiencia exp);
    
    public void borrarExperiencia (Long idexp);
    
    public Experiencia buscarExperiencia(Long idexp);
    
}
