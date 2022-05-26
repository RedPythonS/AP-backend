package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Educacion;

public interface IEducacionServicios {
    
    /*
    public List<Persona> listado ();
    public Persona buscarPersonaId (Long id);
    public void crearPersona (Persona persona);
    public boolean existeId (Long id);
    public void borrarPersona (Long id);
    */

    public List<Educacion> listado ();
    public List<Educacion> mostrar (Long id_persona);
    public Educacion buscarEducacionId (Long id);
    public void crearEducacion (Educacion educacion);
    public boolean existeEducacion (Long id);
    public void borrarEducacion (Long id);
}
