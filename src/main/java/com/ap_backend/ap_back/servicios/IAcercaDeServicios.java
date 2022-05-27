package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.AcercaDe;

public interface IAcercaDeServicios {

    public List<AcercaDe> listado ();
    public AcercaDe buscarAcercaDeId (Long id);
    public void crearAcercaDe (AcercaDe acercade);
    public boolean existeAcercaDe (Long id);
    public void borrarAcercaDe (Long id);
}
