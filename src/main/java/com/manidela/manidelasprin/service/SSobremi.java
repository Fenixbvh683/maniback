
package com.manidela.manidelasprin.service;

import com.manidela.manidelasprin.model.Sobremi;
import com.manidela.manidelasprin.repository.RSobremi;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SSobremi implements ISSobremi{
    
    @Autowired
    public RSobremi sobRepo;

    @Override
    public List<Sobremi> verSobremi() {
       return sobRepo.findAll();
    }

    @Override
    public void crearSobremi(Sobremi sob) {
        sobRepo.save(sob);
    }

    @Override
    public void borrarSobremi(Long idmi) {
        sobRepo.deleteById(idmi);
    }

    @Override
    public Sobremi buscarSobremi(Long idmi) {
       return sobRepo.findById(idmi).orElse(null);
    }
    
}
