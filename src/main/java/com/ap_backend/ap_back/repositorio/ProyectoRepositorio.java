package com.ap_backend.ap_back.repositorio;

import com.ap_backend.ap_back.entidades.Proyectos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepositorio extends JpaRepository<Proyectos, Long> {
    
}
