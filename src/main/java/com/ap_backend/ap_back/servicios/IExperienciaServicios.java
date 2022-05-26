package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Experiencia;

public interface IExperienciaServicios {
        /*
    public List<Persona> listado ();
    public Persona buscarPersonaId (Long id);
    public void crearPersona (Persona persona);
    public boolean existeId (Long id);
    public void borrarPersona (Long id);
    */

    public List<Experiencia> listado ();
    public List<Experiencia> mostrar (Long id_persona);
    public Experiencia buscarExperienciaId (Long id);
    public void crearExperiencia (Experiencia experiencia);
    public boolean existeExperiencia (Long id);
    public void borrarExperiencia (Long id);
}
