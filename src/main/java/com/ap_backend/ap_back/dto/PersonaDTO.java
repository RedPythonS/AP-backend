package com.ap_backend.ap_back.dto;

import javax.validation.constraints.NotBlank;

public class PersonaDTO {
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;
    @NotBlank
    private String descripcion;
    @NotBlank
    private String lugar;
    @NotBlank
    private String contacto;
    @NotBlank
    private String linkImagenFondo;
    @NotBlank
    private String linkImagenFoto;

    public PersonaDTO(){

    }

    

    public PersonaDTO(@NotBlank String nombre, @NotBlank String apellido, @NotBlank String descripcion,
            @NotBlank String lugar, @NotBlank String contacto, @NotBlank String linkImagenFondo,
            @NotBlank String linkImagenFoto) {
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
