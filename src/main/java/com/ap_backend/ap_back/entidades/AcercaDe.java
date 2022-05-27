package com.ap_backend.ap_back.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AcercaDe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long id;
    private String descripcion;

    public AcercaDe() {
    }

    
    public AcercaDe(String descripcion) {
        this.descripcion = descripcion;
    }


    public AcercaDe(Long id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    
}
