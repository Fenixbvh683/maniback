
package com.manidela.manidelasprin.service;

import com.manidela.manidelasprin.model.Sobremi;
import java.util.List;


public interface ISSobremi {
    
    public List<Sobremi> verSobremi();
    
    public void crearSobremi (Sobremi sob);
    
    public void borrarSobremi (Long idmi);
    
    public Sobremi buscarSobremi(Long idmi);
    
}
