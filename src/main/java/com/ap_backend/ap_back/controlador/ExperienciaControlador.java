package com.ap_backend.ap_back.controlador;

import java.util.List;

import com.ap_backend.ap_back.dto.ExperienciaDTO;
import com.ap_backend.ap_back.dto.Mensaje;
import com.ap_backend.ap_back.entidades.Experiencia;
import com.ap_backend.ap_back.servicios.IExperienciaServicios;

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
@RequestMapping("/experiencia")
@CrossOrigin(origins = "*")
public class ExperienciaControlador {

    @Autowired
    private IExperienciaServicios servExperiencia;


    @GetMapping("/ver/experiencias")
    public ResponseEntity<List<Experiencia>> lista () {
        List<Experiencia> lista = servExperiencia.listado();
        return new ResponseEntity<List<Experiencia>>(lista, HttpStatus.OK);
    }

    @GetMapping("/obtener/experiencia/{id}")
    public ResponseEntity<?> buscarExperienciaId(@PathVariable Long id) {
        if (!servExperiencia.existeExperiencia(id))
            return new ResponseEntity<Mensaje>(new Mensaje("Id de experiencia no existe"), HttpStatus.NOT_FOUND);
        Experiencia experiencia = servExperiencia.buscarExperienciaId(id);
            return new ResponseEntity<Experiencia>(experiencia, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<?> crearExperiencia(@RequestBody ExperienciaDTO experienciaDto) {
        if (!StringUtils.hasText(experienciaDto.getLugar()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Lugar"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(experienciaDto.getPuesto()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Puesto"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(experienciaDto.getDesde()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Desde"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(experienciaDto.getHasta()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Hasta"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(experienciaDto.getDescripcion()))
            return new ResponseEntity<Mensaje>(new Mensaje("Ingrese una descripcion"), HttpStatus.BAD_REQUEST);
        Experiencia experiencia = new Experiencia(experienciaDto.getLugar(), experienciaDto.getPuesto(), experienciaDto.getDesde(),experienciaDto.getHasta(),experienciaDto.getDescripcion());
        servExperiencia.crearExperiencia(experiencia);
            return new ResponseEntity<Mensaje>(new Mensaje("Experiencia creada"), HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody ExperienciaDTO experienciaDto) {
        if(!servExperiencia.existeExperiencia(id))
            return new ResponseEntity<Mensaje>(new Mensaje("Id no existe"), HttpStatus.NOT_FOUND);
        if (!StringUtils.hasText(experienciaDto.getLugar()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Lugar"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(experienciaDto.getPuesto()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Puesto"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(experienciaDto.getDesde()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Desde"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(experienciaDto.getHasta()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Hasta"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(experienciaDto.getDescripcion()))
            return new ResponseEntity<Mensaje>(new Mensaje("Ingrese una descripcion"), HttpStatus.BAD_REQUEST);
        Experiencia experiencia = servExperiencia.buscarExperienciaId(id);
        experiencia.setLugar(experienciaDto.getLugar());
        experiencia.setPuesto(experienciaDto.getPuesto());
        experiencia.setDesde(experienciaDto.getDesde());
        experiencia.setHasta(experienciaDto.getHasta());
        experiencia.setDescripcion(experienciaDto.getDescripcion());
        servExperiencia.crearExperiencia(experiencia);
        return new ResponseEntity<Mensaje>(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrado(@PathVariable Long id) {
        if(!servExperiencia.existeExperiencia(id))
            return new ResponseEntity<Mensaje>(new Mensaje("No existe el id"), HttpStatus.NOT_FOUND);
        servExperiencia.borrarExperiencia(id);
            return new ResponseEntity<Mensaje>(new Mensaje("Experiencia borrada"), HttpStatus.OK);
    }
    
}
