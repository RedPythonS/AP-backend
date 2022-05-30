package com.ap_backend.ap_back.repositorio;

import com.ap_backend.ap_back.entidades.Habilidades;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadesRepositorio extends JpaRepository<Habilidades, Long> {
    
}
