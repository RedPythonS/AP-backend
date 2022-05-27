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
    
}
