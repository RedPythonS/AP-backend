package com.ap_backend.ap_back.servicios;

import java.util.List;

import com.ap_backend.ap_back.entidades.Persona;
import com.ap_backend.ap_back.repositorio.PersonaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServicios implements IPersonaServicios {

    @Autowired
    PersonaRepositorio repoPersona;

    @Override
    public List<Persona> listado() {
        return repoPersona.findAll();
    }

    @Override
    public Persona buscarPersonaId(Long id) {
        return repoPersona.findById(id).orElse(null);
    }

    @Override
    public void crearPersona(Persona persona) {
        repoPersona.save(persona);
    }

    @Override
    public boolean existeId(Long id) {
        return repoPersona.existsById(id);
    }

    @Override
    public void borrarPersona(Long id) {
        repoPersona.deleteById(id);
    }

    
    
}
