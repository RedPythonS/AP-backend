package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Experiencia;
import com.ap_backend.ap_back.repositorio.ExperienciaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaServicios implements IExperienciaServicios {

    @Autowired
    ExperienciaRepositorio repoExperiencia;

    @Override
    public List<Experiencia> listado() {
        return repoExperiencia.findAll();
    }

    @Override
    public Experiencia buscarExperienciaId(Long id) {
        return repoExperiencia.findById(id).orElse(null);
    }

    @Override
    public void crearExperiencia(Experiencia experiencia) {
        repoExperiencia.save(experiencia);
        
    }

    @Override
    public boolean existeExperiencia(Long id) {
        return repoExperiencia.existsById(id);
    }

    @Override
    public void borrarExperiencia(Long id) {
        repoExperiencia.deleteById(id);
        
    }
    
}
