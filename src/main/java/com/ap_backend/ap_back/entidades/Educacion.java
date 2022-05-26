package com.ap_backend.ap_back.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long id_persona;
    private String lugar;
    private String titulo;
    private String periodo;
    public Educacion() {
    }

    public Educacion(Long id_persona, String lugar, String titulo, String periodo) {
        this.id_persona = id_persona;
        this.lugar = lugar;
        this.titulo = titulo;
        this.periodo = periodo;
    }

    
    public Educacion(Long id, Long id_persona, String lugar, String titulo, String periodo) {
        this.id = id;
        this.id_persona = id_persona;
        this.lugar = lugar;
        this.titulo = titulo;
        this.periodo = periodo;
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
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    
    
}
