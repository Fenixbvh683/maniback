
package com.manidela.manidelasprin.service;

import com.manidela.manidelasprin.model.Habilidad;
import com.manidela.manidelasprin.repository.RHabilidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SHabilidad implements ISHabilidad{
    
    @Autowired
    public RHabilidad habiRepo;

    @Override
    public List<Habilidad> verHabilidad() {
       return habiRepo.findAll();
    }

    @Override
    public void crearHabilidad(Habilidad hab) {
        habiRepo.save(hab);
    }

    @Override
    public void borrarHabilidad(Long idhab) {
        habiRepo.deleteById(idhab);
    }

    @Override
    public Habilidad buscarHabilidad(Long idhab) {
       return habiRepo.findById(idhab).orElse(null);
    }
    
}
