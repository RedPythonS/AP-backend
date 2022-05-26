package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Habilidades;

public interface IHabilidadesServicios {
        /*
    public List<Persona> listado ();
    public Persona buscarPersonaId (Long id);
    public void crearPersona (Persona persona);
    public boolean existeId (Long id);
    public void borrarPersona (Long id);
    */

    public List<Habilidades> listado ();
    public List<Habilidades> mostrar (Long id_persona);
    public Habilidades buscarHabilidades (Long id);
    public void crearHabilidades (Habilidades habilidades);
    public boolean exiteHabilidades (Long id);
    public void borrarHabilidades (Long id);
}
