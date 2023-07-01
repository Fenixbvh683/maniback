
package com.manidela.manidelasprin.service;

import com.manidela.manidelasprin.model.Estudio;
import com.manidela.manidelasprin.repository.REstudio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SEstudio implements ISEstudio{
    
    @Autowired
    public REstudio estuRepo;

    @Override
    public List<Estudio> verEstudio() {
       return estuRepo.findAll();
    }

    @Override
    public void crearEstudio(Estudio est) {
        estuRepo.save(est);
    }

    @Override
    public void borrarEstudio(Long idest) {
        estuRepo.deleteById(idest);
    }

    @Override
    public Estudio buscarEstudio(Long idest) {
       return estuRepo.findById(idest).orElse(null);
    }
    
}
