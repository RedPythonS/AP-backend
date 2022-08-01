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
    private String desde;
    private String hasta;
    private String imagen;
    public Educacion() {
    }
    public Educacion(String lugar, String titulo, String desde, String hasta, String imagen) {
        this.lugar = lugar;
        this.titulo = titulo;
        this.desde = desde;
        this.hasta = hasta;
        this.imagen = imagen;
    }
    public Educacion(Long id, String lugar, String titulo, String desde, String hasta, String imagen) {
        this.id = id;
        this.lugar = lugar;
        this.titulo = titulo;
        this.desde = desde;
        this.hasta = hasta;
        this.imagen = imagen;
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
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDesde() {
        return desde;
    }
    public void setDesde(String desde) {
        this.desde = desde;
    }
    public String getHasta() {
        return hasta;
    }
    public void setHasta(String hasta) {
        this.hasta = hasta;
    }
    
}
