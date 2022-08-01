package com.ap_backend.ap_back.dto;

import javax.validation.constraints.NotBlank;

public class HabilidadDTO {
    
    @NotBlank
    private String nombre;
    @NotBlank
    private String detalle;
    @NotBlank
    private int nivel;
    public HabilidadDTO() {
    }
    public HabilidadDTO(@NotBlank String nombre, @NotBlank String detalle, @NotBlank int nivel) {
        this.nombre = nombre;
        this.detalle = detalle;
        this.nivel = nivel;
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
