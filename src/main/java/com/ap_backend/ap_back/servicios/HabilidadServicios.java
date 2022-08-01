package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Habilidad;
import com.ap_backend.ap_back.repositorio.HabilidadRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadServicios implements IHabilidadServicios {

    @Autowired
    HabilidadRepositorio repoHabilidad;

    @Override
    public List<Habilidad> listado() {
        return repoHabilidad.findAll();
    }

    @Override
    public Habilidad buscarHabilidadId(Long id) {
        return repoHabilidad.findById(id).orElse(null);
    }

    @Override
    public void crearHabilidad(Habilidad habilidad) {
        repoHabilidad.save(habilidad);
        
    }

    @Override
    public boolean existeHabilidad(Long id) {
        return repoHabilidad.existsById(id);
    }

    @Override
    public void borrarHabilidad(Long id) {
        repoHabilidad.deleteById(id);
        
    }
    
}
