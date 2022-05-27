package com.ap_backend.ap_back.dto;

import javax.validation.constraints.NotBlank;

public class AcercaDeDTO {
    
    @NotBlank
    private String descripcion;

    public AcercaDeDTO() {
    }

    public AcercaDeDTO(@NotBlank String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
