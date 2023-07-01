
package com.manidela.manidelasprin.service;

import com.manidela.manidelasprin.model.Habilidad;
import java.util.List;


public interface ISHabilidad {
    
    public List<Habilidad> verHabilidad();
    
    public void crearHabilidad (Habilidad hab);
    
    public void borrarHabilidad (Long idhab);
    
    public Habilidad buscarHabilidad(Long idhab);
    
}
