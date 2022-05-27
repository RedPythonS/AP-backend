package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Experiencia;

public interface IExperienciaServicios {

    public List<Experiencia> listado ();
    public Experiencia buscarExperienciaId (Long id);
    public void crearExperiencia (Experiencia experiencia);
    public boolean existeExperiencia (Long id);
    public void borrarExperiencia (Long id);
}
