
package com.manidela.manidelasprin.service;

import com.manidela.manidelasprin.model.Experiencia;
import com.manidela.manidelasprin.repository.RExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SExperiencia implements ISExperiencia{
    
    @Autowired
    public RExperiencia expeRepo;

    @Override
    public List<Experiencia> verExperiencia() {
       return expeRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        expeRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long idexp) {
        expeRepo.deleteById(idexp);
    }

    @Override
    public Experiencia buscarExperiencia(Long idexp) {
       return expeRepo.findById(idexp).orElse(null);
    }
    
}
