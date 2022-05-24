package com.ap_backend.ap_back.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Educacion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String lugar;
    private String titulo;
    private String periodo;
    public Educacion() {
    }
    public Educacion(String lugar, String titulo, String periodo) {
        this.lugar = lugar;
        this.titulo = titulo;
        this.periodo = periodo;
    }
    public Educacion(Long id, String lugar, String titulo, String periodo) {
        this.id = id;
        this.lugar = lugar;
        this.titulo = titulo;
        this.periodo = periodo;
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
