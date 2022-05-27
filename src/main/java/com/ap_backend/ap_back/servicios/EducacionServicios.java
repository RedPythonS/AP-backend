package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Educacion;
import com.ap_backend.ap_back.repositorio.EducacionRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionServicios implements IEducacionServicios {

    @Autowired
    EducacionRepositorio repoEducacion;

    @Override
    public List<Educacion> listado() {
        return repoEducacion.findAll();
    }

    @Override
    public Educacion buscarEducacionId(Long id) {
        return repoEducacion.findById(id).orElse(null);
    }

    @Override
    public void crearEducacion(Educacion educacion) {
        repoEducacion.save(educacion);
        
    }

    @Override
    public boolean existeEducacion(Long id) {
        
        return repoEducacion.existsById(id);
    }

    @Override
    public void borrarEducacion(Long id) {
        repoEducacion.deleteById(id);
        
    }
    
}
