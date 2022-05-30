package com.ap_backend.ap_back.controlador;

import java.util.List;

import com.ap_backend.ap_back.dto.HabilidadDTO;
import com.ap_backend.ap_back.dto.Mensaje;
import com.ap_backend.ap_back.entidades.Habilidad;
import com.ap_backend.ap_back.servicios.IHabilidadServicios;

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
@RequestMapping("/habilidad")
@CrossOrigin(origins = "*")
public class HabilidadControlador {

    @Autowired
    private IHabilidadServicios servHabilidad;
    

    @GetMapping("/ver/habilidades")
    public ResponseEntity<List<Habilidad>> lista () {
        List<Habilidad> lista = servHabilidad.listado();
        return new ResponseEntity<List<Habilidad>>(lista, HttpStatus.OK);
    }

    @GetMapping("/obtener/habilidad/{id}")
    public ResponseEntity<?> buscarHabilidadId(@PathVariable Long id) {
        if(!servHabilidad.existeHabilidad(id))
            return new ResponseEntity<Mensaje>(new Mensaje("id de habilidad no existe"), HttpStatus.NOT_FOUND);
        Habilidad habilidad = servHabilidad.buscarHabilidadId(id);
            return new ResponseEntity<Habilidad>(habilidad, HttpStatus.OK);

    }

    @PostMapping("/crear")
    public ResponseEntity<?> crearHabilidad(@RequestBody HabilidadDTO habilidadDto) {
        if (!StringUtils.hasText(habilidadDto.getNombre()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Nombre"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(habilidadDto.getDetalle()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Detalle"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(Integer.toString(habilidadDto.getNivel())))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere un valor para el Nivel"), HttpStatus.BAD_REQUEST);
        Habilidad habilidad = new Habilidad(habilidadDto.getNombre(), habilidadDto.getDetalle(), habilidadDto.getNivel());
        servHabilidad.crearHabilidad(habilidad);
            return new ResponseEntity<Mensaje>(new Mensaje("Habilidad creada"), HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody HabilidadDTO habilidadDto) {
        if(!servHabilidad.existeHabilidad(id))
            return new ResponseEntity<Mensaje>(new Mensaje("Id no existe"), HttpStatus.NOT_FOUND);
        if (!StringUtils.hasText(habilidadDto.getNombre()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Nombre"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(habilidadDto.getDetalle()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Detalle"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(Integer.toString(habilidadDto.getNivel())))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere un valor para el Nivel"), HttpStatus.BAD_REQUEST);
        Habilidad habilidad = servHabilidad.buscarHabilidadId(id);
        habilidad.setNombre(habilidadDto.getNombre());
        habilidad.setDetalle(habilidadDto.getDetalle());
        habilidad.setNivel(habilidadDto.getNivel());
        servHabilidad.crearHabilidad(habilidad);
        return new ResponseEntity<Mensaje>(new Mensaje("Habilidad actualizada"), HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrado(@PathVariable Long id) {
        if(!servHabilidad.existeHabilidad(id))
            return new ResponseEntity<Mensaje>(new Mensaje("No existe el id"), HttpStatus.NOT_FOUND);
        servHabilidad.borrarHabilidad(id);
            return new ResponseEntity<Mensaje>(new Mensaje("Habilidad borrada"), HttpStatus.OK);
    }

}
