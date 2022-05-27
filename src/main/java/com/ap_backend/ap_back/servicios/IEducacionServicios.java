package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Educacion;

public interface IEducacionServicios {

    public List<Educacion> listado ();
    public Educacion buscarEducacionId (Long id);
    public void crearEducacion (Educacion educacion);
    public boolean existeEducacion (Long id);
    public void borrarEducacion (Long id);
}
