package com.ap_backend.ap_back.controlador;

import com.ap_backend.ap_back.servicios.IPersonaServicios;


import java.util.List;

import com.ap_backend.ap_back.dto.Mensaje;
import com.ap_backend.ap_back.dto.PersonaDTO;
import com.ap_backend.ap_back.entidades.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "*")
public class Controlador {

    @Autowired
    private IPersonaServicios servPersona;

    @GetMapping("/ver/personas")
    public ResponseEntity<List<Persona>> lista() {
        List<Persona> lista = servPersona.listado();
        return new ResponseEntity<List<Persona>>(lista, HttpStatus.OK);
    }

    @GetMapping("/obtener/persona/{id}")
    public ResponseEntity<?> buscarPersonaId(@PathVariable Long id) {
        if (!servPersona.existeId(id))
            return new ResponseEntity<Mensaje>(new Mensaje("Id no existe!!"), HttpStatus.NOT_FOUND);
        Persona persona = servPersona.buscarPersonaId(id);
        return new ResponseEntity<Persona>(persona, HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<?> crearPersona(@RequestBody PersonaDTO personaDto) {

        if(!StringUtils.hasText(personaDto.getNombre()))
           return new ResponseEntity<Mensaje>(new Mensaje("El nombre es requerido"),HttpStatus.BAD_REQUEST);
        if(!StringUtils.hasText(personaDto.getApellido()))
           return new ResponseEntity<Mensaje>(new Mensaje("El apellido es requerido"), HttpStatus.BAD_REQUEST);
        if(!StringUtils.hasText(personaDto.getDescripcion()))
           return new ResponseEntity<Mensaje>(new Mensaje("La descripcion es requerida"), HttpStatus.BAD_REQUEST);
        if(!StringUtils.hasText(personaDto.getLugar()))
           return new ResponseEntity<Mensaje>(new Mensaje("El lugares requerido"), HttpStatus.BAD_REQUEST);
        if(!StringUtils.hasText(personaDto.getContacto()))
           return new ResponseEntity<Mensaje>(new Mensaje("El contacto es requerido"), HttpStatus.BAD_REQUEST);
        if(!StringUtils.hasText(personaDto.getLinkImagenFondo()))
           return new ResponseEntity<Mensaje>(new Mensaje("El link de imagen de fondo es requerido"), HttpStatus.BAD_REQUEST);
        if(!StringUtils.hasText(personaDto.getLinkImagenFoto()))
           return new ResponseEntity<Mensaje>(new Mensaje("El link de imagen de pefil es requerido"), HttpStatus.BAD_REQUEST);
        Persona persona = new Persona(personaDto.getNombre(), personaDto.getApellido(), personaDto.getDescripcion(),
        personaDto.getLugar(),personaDto.getContacto(),personaDto.getLinkImagenFondo(), personaDto.getLinkImagenFoto());
        servPersona.crearPersona(persona);
        return new ResponseEntity<Mensaje>(new Mensaje("Persona creada"),HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody PersonaDTO personaDto) {
        if(!servPersona.existeId(id))
            return new ResponseEntity<Mensaje>(new Mensaje("Id no existe"), HttpStatus.NOT_FOUND);
        if(!StringUtils.hasText(personaDto.getNombre()))
            return new ResponseEntity<Mensaje>(new Mensaje("El nombre es requerido"),HttpStatus.BAD_REQUEST);
        if(!StringUtils.hasText(personaDto.getApellido()))
            return new ResponseEntity<Mensaje>(new Mensaje("El apellido es requerido"), HttpStatus.BAD_REQUEST);
            if(!StringUtils.hasText(personaDto.getDescripcion()))
            return new ResponseEntity<Mensaje>(new Mensaje("La descripcion es requerida"), HttpStatus.BAD_REQUEST);
            if(!StringUtils.hasText(personaDto.getLugar()))
            return new ResponseEntity<Mensaje>(new Mensaje("El lugares requerido"), HttpStatus.BAD_REQUEST);
            if(!StringUtils.hasText(personaDto.getContacto()))
            return new ResponseEntity<Mensaje>(new Mensaje("El contacto es requerido"), HttpStatus.BAD_REQUEST);
            if(!StringUtils.hasText(personaDto.getLinkImagenFondo()))
            return new ResponseEntity<Mensaje>(new Mensaje("El link de imagen de fondo es requerido"), HttpStatus.BAD_REQUEST);
            if(!StringUtils.hasText(personaDto.getLinkImagenFoto()))
            return new ResponseEntity<Mensaje>(new Mensaje("El link de imagen de pefil es requerido"), HttpStatus.BAD_REQUEST);
        Persona persona = servPersona.buscarPersonaId(id);
        persona.setNombre(personaDto.getNombre());
        persona.setApellido(personaDto.getApellido());
        persona.setDescripcion(personaDto.getDescripcion());
        persona.setLugar(personaDto.getLugar());
        persona.setContacto(personaDto.getContacto());
        persona.setLinkImagenFondo(personaDto.getLinkImagenFondo());
        persona.setLinkImagenFoto(personaDto.getLinkImagenFoto());
        servPersona.crearPersona(persona);
        return new ResponseEntity<Mensaje>(new Mensaje("Persona actualizada"),HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrado(@PathVariable Long id) {
        if(!servPersona.existeId(id))
            return new ResponseEntity<Mensaje>(new Mensaje("Id no existe"),HttpStatus.NOT_FOUND);
        servPersona.borrarPersona(id);
        return new ResponseEntity<Mensaje>(new Mensaje("Persona borrada"), HttpStatus.OK);
    }



    
}
