package com.ap_backend.ap_back.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Habilidades {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long id_persona;
    private String nombre;
    private String detalle;
    private int nivel;
    public Habilidades() {
    }
    public Habilidades(Long id_persona, String nombre, String detalle, int nivel) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.detalle = detalle;
        this.nivel = nivel;
    }
    
    public Habilidades(Long id, Long id_persona, String nombre, String detalle, int nivel) {
        this.id = id;
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.detalle = detalle;
        this.nivel = nivel;
    }
    
    public Long getId_persona() {
        return id_persona;
    }
    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDetalle() {
        return detalle;
    }
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    
}
