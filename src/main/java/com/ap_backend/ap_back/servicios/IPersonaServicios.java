package com.ap_backend.ap_back.servicios;

import java.util.List;
import com.ap_backend.ap_back.entidades.Persona;

public interface IPersonaServicios {

    public List<Persona> listado ();
    public Persona buscarPersonaId (Long id);
    public void crearPersona (Persona persona);
    public boolean existeId (Long id);
    public void borrarPersona (Long id);

}
