
package com.manidela.manidelasprin.service;

import com.manidela.manidelasprin.model.Estudio;
import java.util.List;


public interface ISEstudio {
    
    public List<Estudio> verEstudio();
    
    public void crearEstudio (Estudio est);
    
    public void borrarEstudio (Long idest);
    
    public Estudio buscarEstudio(Long idest);
    
}
