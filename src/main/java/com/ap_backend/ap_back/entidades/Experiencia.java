package com.ap_backend.ap_back.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long id_persona;
    private String lugar;
    private String puesto;
    private String desde;
    private String hasta;
    private String descripcion;
    public Experiencia() {
    }

    public Experiencia(Long id_persona, String lugar, String puesto, String desde, String hasta, String descripcion) {
        this.id_persona = id_persona;
        this.lugar = lugar;
        this.puesto = puesto;
        this.desde = desde;
        this.hasta = hasta;
        this.descripcion = descripcion;
    }
    
    public Experiencia(Long id, Long id_persona, String lugar, String puesto, String desde, String hasta,
            String descripcion) {
        this.id = id;
        this.id_persona = id_persona;
        this.lugar = lugar;
        this.puesto = puesto;
        this.desde = desde;
        this.hasta = hasta;
        this.descripcion = descripcion;
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
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
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
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
