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
    private String lugar;
    private String titulo;
    private String start;
    private String end;
    public Educacion() {
    }
 
    public Educacion(String lugar, String titulo, String start, String end) {
        this.lugar = lugar;
        this.titulo = titulo;
        this.start = start;
        this.end = end;
    }

    
    public Educacion(Long id, String lugar, String titulo, String start, String end) {
        this.id = id;
        this.lugar = lugar;
        this.titulo = titulo;
        this.start = start;
        this.end = end;
    }

    public String getStart() {
        return start;
    }


    public void setStart(String start) {
        this.start = start;
    }


    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
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

}
