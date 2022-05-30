package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Proyecto;

public interface IProyectoServicios {

    public List<Proyecto> listado ();
    public Proyecto buscarProyecto (Long id);
    public void crearProyecto (Proyecto proyecto);
    public boolean existeProyecto (Long id);
    public void borrarProyecto (Long id);
}
