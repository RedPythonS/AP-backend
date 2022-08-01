package com.ap_backend.ap_back.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String apellido;
    private String descripcion;
    private String lugar;
    private String contacto;
    private String linkImagenFondo;
    private String linkImagenFoto;

    public Persona(){        
    }


    public Persona(String nombre, String apellido, String descripcion, String lugar, String contacto,
            String linkImagenFondo, String linkImagenFoto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.contacto = contacto;
        this.linkImagenFondo = linkImagenFondo;
        this.linkImagenFoto = linkImagenFoto;
    }

    

    public Persona(Long id, String nombre, String apellido, String descripcion, String lugar, String contacto,
            String linkImagenFondo, String linkImagenFoto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.descripcion = descripcion;
        this.lugar = lugar;
        this.contacto = contacto;
        this.linkImagenFondo = linkImagenFondo;
        this.linkImagenFoto = linkImagenFoto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getLinkImagenFondo() {
        return linkImagenFondo;
    }

    public void setLinkImagenFondo(String linkImagenFondo) {
        this.linkImagenFondo = linkImagenFondo;
    }

    public String getLinkImagenFoto() {
        return linkImagenFoto;
    }

    public void setLinkImagenFoto(String linkImagenFoto) {
        this.linkImagenFoto = linkImagenFoto;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    

    
}
