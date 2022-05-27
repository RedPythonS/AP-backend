package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Habilidades;

public interface IHabilidadesServicios {

    public List<Habilidades> listado ();
    public Habilidades buscarHabilidades (Long id);
    public void crearHabilidades (Habilidades habilidades);
    public boolean exiteHabilidades (Long id);
    public void borrarHabilidades (Long id);
}
