package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Proyectos;

public interface IProyectosServicios {

    public List<Proyectos> listado ();
    public Proyectos buscarProyectos (Long id);
    public void crearProyectos (Proyectos proyectos);
    public boolean existeProyectos (Long id);
    public void borrarProyectos (Long id);
}
