package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.AcercaDe;
import com.ap_backend.ap_back.repositorio.AcercaDeRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcercaDeServicios implements IAcercaDeServicios {

    @Autowired
    AcercaDeRepositorio repoAcercaDe;

    @Override
    public void borrarAcercaDe(Long id) {
        repoAcercaDe.deleteById(id);
        
    }

    @Override
    public AcercaDe buscarAcercaDeId(Long id) {
        return repoAcercaDe.findById(id).orElse(null);
    }

    @Override
    public void crearAcercaDe(AcercaDe acercade) {
        repoAcercaDe.save(acercade);
        
    }

    @Override
    public boolean existeAcercaDe(Long id) {
        return repoAcercaDe.existsById(id);
    }

    @Override
    public List<AcercaDe> listado() {
        return repoAcercaDe.findAll();
    }
    
}
