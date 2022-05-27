package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Habilidades;
import com.ap_backend.ap_back.repositorio.HabilidadesRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HabilidadesServicios implements IHabilidadesServicios {

    @Autowired
    HabilidadesRepositorio repoHabilidades;

    @Override
    public List<Habilidades> listado() {
        return repoHabilidades.findAll();
    }

    @Override
    public Habilidades buscarHabilidades(Long id) {
        return repoHabilidades.findById(id).orElse(null);
    }

    @Override
    public void crearHabilidades(Habilidades habilidades) {
        repoHabilidades.save(habilidades);
        
    }

    @Override
    public boolean exiteHabilidades(Long id) {
        return repoHabilidades.existsById(id);
    }

    @Override
    public void borrarHabilidades(Long id) {
        repoHabilidades.deleteById(id);
        
    }
    
}
