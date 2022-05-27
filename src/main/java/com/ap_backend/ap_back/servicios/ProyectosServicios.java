package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Proyectos;
import com.ap_backend.ap_back.repositorio.ProyectosRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosServicios implements IProyectosServicios {

    @Autowired
    ProyectosRepositorio repoProyectos;

    @Override
    public void borrarProyectos(Long id) {
        repoProyectos.deleteById(id);
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
        return repoProyectos.findById(id).orElse(null);
    }

    @Override
    public void crearProyectos(Proyectos proyectos) {
        repoProyectos.save(proyectos);
        
    }

    @Override
    public boolean existeProyectos(Long id) {
        return repoProyectos.existsById(id);
    }

    @Override
    public List<Proyectos> listado() {
        return repoProyectos.findAll();
    }
    
}
