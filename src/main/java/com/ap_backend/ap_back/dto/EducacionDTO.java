package com.ap_backend.ap_back.dto;

import javax.validation.constraints.NotBlank;

public class EducacionDTO {
    
    @NotBlank
    private String lugar;
    @NotBlank
    private String titulo;
    @NotBlank
    private String start;
    @NotBlank
    private String end;
    public EducacionDTO() {
    }
    public EducacionDTO(@NotBlank String lugar, @NotBlank String titulo, @NotBlank String start, @NotBlank String end) {
        this.lugar = lugar;
        this.titulo = titulo;
        this.start = start;
        this.end = end;
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
    
    
}
