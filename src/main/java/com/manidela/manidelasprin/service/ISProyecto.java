
package com.manidela.manidelasprin.service;

import com.manidela.manidelasprin.model.Proyecto;
import java.util.List;


public interface ISProyecto {
    
    public List<Proyecto> verProyecto();
    
    public void crearProyecto (Proyecto pro);
    
    public void borrarProyecto (Long idpro);
    
    public Proyecto buscarProyecto(Long idpro);
    
}
