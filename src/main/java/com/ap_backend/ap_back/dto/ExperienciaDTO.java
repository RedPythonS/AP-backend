package com.ap_backend.ap_back.dto;

import javax.validation.constraints.NotBlank;

public class ExperienciaDTO {
    
    @NotBlank
    private String lugar;
    @NotBlank
    private String puesto;
    @NotBlank
    private String desde;
    @NotBlank
    private String hasta;
    @NotBlank
    private String descripcion;
    public ExperienciaDTO() {
    }
    public ExperienciaDTO(@NotBlank String lugar, @NotBlank String puesto, @NotBlank String desde,
            @NotBlank String hasta, @NotBlank String descripcion) {
        this.lugar = lugar;
        this.puesto = puesto;
        this.desde = desde;
        this.hasta = hasta;
        this.descripcion = descripcion;
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
