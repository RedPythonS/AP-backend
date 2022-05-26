package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Proyectos;

public interface IProyectosServicios {
        /*
    public List<Persona> listado ();
    public Persona buscarPersonaId (Long id);
    public void crearPersona (Persona persona);
    public boolean existeId (Long id);
    public void borrarPersona (Long id);
    */

    public List<Proyectos> listado ();
    public List<Proyectos> mostrar (Long id_persona);
    public Proyectos buscarProyectos (Long id);
    public void crearProyectos (Proyectos proyectos);
    public boolean existeProyectos (Long id);
    public void borrarProyectos (Long id);
}
