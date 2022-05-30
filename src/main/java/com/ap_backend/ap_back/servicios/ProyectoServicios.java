package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Proyecto;
import com.ap_backend.ap_back.repositorio.ProyectoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoServicios implements IProyectoServicios {

    @Autowired
    ProyectoRepositorio repoProyecto;

    @Override
    public void borrarProyecto(Long id) {
        repoProyecto.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return repoProyecto.findById(id).orElse(null);
    }

    @Override
    public void crearProyecto(Proyecto proyecto) {
        repoProyecto.save(proyecto);
        
    }

    @Override
    public boolean existeProyecto(Long id) {
        return repoProyecto.existsById(id);
    }

    @Override
    public List<Proyecto> listado() {
        return repoProyecto.findAll();
    }
    
}
