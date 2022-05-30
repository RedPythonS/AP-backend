package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Habilidad;

public interface IHabilidadServicios {

    public List<Habilidad> listado ();
    public Habilidad buscarHabilidadId (Long id);
    public void crearHabilidad (Habilidad habilidades);
    public boolean existeHabilidad (Long id);
    public void borrarHabilidad (Long id);
}
