
package com.manidela.manidelasprin.service;

import com.manidela.manidelasprin.model.Proyecto;
import com.manidela.manidelasprin.repository.RProyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SProyecto implements ISProyecto{
    
    @Autowired
    public RProyecto proRepo;

    @Override
    public List<Proyecto> verProyecto() {
       return proRepo.findAll();
    }

    @Override
    public void crearProyecto(Proyecto pro) {
        proRepo.save(pro);
    }

    @Override
    public void borrarProyecto(Long idpro) {
        proRepo.deleteById(idpro);
    }

    @Override
    public Proyecto buscarProyecto(Long idpro) {
       return proRepo.findById(idpro).orElse(null);
    }
    
}
