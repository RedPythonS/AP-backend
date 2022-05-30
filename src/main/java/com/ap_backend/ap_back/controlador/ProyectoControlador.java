package com.ap_backend.ap_back.controlador;

import java.util.List;

import com.ap_backend.ap_back.dto.Mensaje;
import com.ap_backend.ap_back.dto.ProyectoDTO;
import com.ap_backend.ap_back.entidades.Proyecto;
import com.ap_backend.ap_back.servicios.IProyectoServicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyecto")
@CrossOrigin(origins = "*")
public class ProyectoControlador {

    @Autowired
    private IProyectoServicios servProyecto;

    @GetMapping("/ver/proyectos")
    public ResponseEntity<List<Proyecto>> lista () {
        List<Proyecto> lista = servProyecto.listado();
        return new ResponseEntity<List<Proyecto>>(lista, HttpStatus.OK);
    }

    @GetMapping("/obtener/proyecto/{id}")
    public ResponseEntity<?> buscarProyectoId(@PathVariable Long id) {
        if (!servProyecto.existeProyecto(id))
            return new ResponseEntity<Mensaje>(new Mensaje("Id de Proyecto no existe"), HttpStatus.NOT_FOUND);
        Proyecto proyecto = servProyecto.buscarProyecto(id);
            return new ResponseEntity<Proyecto>(proyecto, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<?> crearProyecto(@RequestBody ProyectoDTO proyectoDto) {
        if (!StringUtils.hasText(proyectoDto.getNombre()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Nombre"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(proyectoDto.getFecha()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Fecha de Proyecto"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(proyectoDto.getDescripcion()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Descripción"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(proyectoDto.getLink()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el Link del Proyecto"), HttpStatus.BAD_REQUEST);
        Proyecto proyecto = new Proyecto(proyectoDto.getNombre(), proyectoDto.getFecha(), proyectoDto.getDescripcion(),proyectoDto.getLink());
        servProyecto.crearProyecto(proyecto);
            return new ResponseEntity<Mensaje>(new Mensaje("Proyecto creado"), HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody ProyectoDTO proyectoDto) {
        if (!servProyecto.existeProyecto(id))
            return new ResponseEntity<Mensaje>(new Mensaje("Id no existe"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(proyectoDto.getNombre()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Nombre"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(proyectoDto.getFecha()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Fecha de Proyecto"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(proyectoDto.getDescripcion()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Descripción"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(proyectoDto.getLink()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el Link del Proyecto"), HttpStatus.BAD_REQUEST);
        Proyecto proyecto = servProyecto.buscarProyecto(id);
        proyecto.setNombre(proyectoDto.getNombre());
        proyecto.setFecha(proyectoDto.getFecha());
        proyecto.setDescripcion(proyectoDto.getDescripcion());
        proyecto.setLink(proyectoDto.getLink());
        servProyecto.crearProyecto(proyecto);
        return new ResponseEntity<Mensaje>(new Mensaje("Proyecto actualizado"), HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrado(@PathVariable Long id) {
        if(!servProyecto.existeProyecto(id))
            return new ResponseEntity<Mensaje>(new Mensaje("No existe el Id"), HttpStatus.NOT_FOUND);
        servProyecto.borrarProyecto(id);
             return new ResponseEntity<Mensaje>(new Mensaje("Proyecto borrado"), HttpStatus.OK);
    }
    
}
