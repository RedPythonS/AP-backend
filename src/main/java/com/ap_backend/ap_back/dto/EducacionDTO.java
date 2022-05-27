package com.ap_backend.ap_back.dto;

import javax.validation.constraints.NotBlank;

public class EducacionDTO {

    @NotBlank
    private String lugar;
    @NotBlank
    private String titulo;
    @NotBlank
    private String desde;
    @NotBlank
    private String hasta;
    public EducacionDTO() {
    }
    public EducacionDTO(@NotBlank String lugar, @NotBlank String titulo, @NotBlank String desde,
            @NotBlank String hasta) {
        this.lugar = lugar;
        this.titulo = titulo;
        this.desde = desde;
        this.hasta = hasta;
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
