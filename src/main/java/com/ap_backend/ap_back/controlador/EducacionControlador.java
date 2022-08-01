package com.ap_backend.ap_back.controlador;

import java.util.List;

import com.ap_backend.ap_back.dto.EducacionDTO;
import com.ap_backend.ap_back.dto.Mensaje;
import com.ap_backend.ap_back.entidades.Educacion;
import com.ap_backend.ap_back.servicios.IEducacionServicios;

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
@RequestMapping("/educacion")
@CrossOrigin(origins = "*")
public class EducacionControlador {

    @Autowired
    private IEducacionServicios servEducacion;

    @GetMapping("/ver/educaciones")
    public ResponseEntity<List<Educacion>> lista () {
        List<Educacion> lista = servEducacion.listado();
        return new ResponseEntity<List<Educacion>>(lista, HttpStatus.OK);
    }

    @GetMapping("/obtener/educacion/{id}")
    public ResponseEntity<?> buscarEducacionId(@PathVariable Long id) {
        if (!servEducacion.existeEducacion(id))
            return new ResponseEntity<Mensaje>(new Mensaje("Id de educacion no existe"), HttpStatus.NOT_FOUND);
        Educacion educacion = servEducacion.buscarEducacionId(id);
            return new ResponseEntity<Educacion>(educacion, HttpStatus.OK);
    }

    @PostMapping("/crear")
    public ResponseEntity<?> crearEducacion(@RequestBody EducacionDTO educacionDto) {
        if (!StringUtils.hasText(educacionDto.getLugar()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Lugar"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(educacionDto.getTitulo()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Titulo"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(educacionDto.getDesde()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Desde"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(educacionDto.getHasta()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Hasta"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(educacionDto.getImagen()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el link de imagen"), HttpStatus.BAD_REQUEST);
        Educacion educacion = new Educacion(educacionDto.getLugar(), educacionDto.getTitulo(), educacionDto.getDesde(), educacionDto.getHasta(), educacionDto.getImagen());
        servEducacion.crearEducacion(educacion);
            return new ResponseEntity<Mensaje>(new Mensaje("Educacion creada"), HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody EducacionDTO educacionDto) {
        if(!servEducacion.existeEducacion(id))
            return new ResponseEntity<Mensaje>(new Mensaje("Id no existe"), HttpStatus.NOT_FOUND);
        if (!StringUtils.hasText(educacionDto.getLugar()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Lugar"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(educacionDto.getTitulo()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Titulo"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(educacionDto.getDesde()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Desde"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(educacionDto.getHasta()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el dato Hasta"), HttpStatus.BAD_REQUEST);
        if (!StringUtils.hasText(educacionDto.getImagen()))
            return new ResponseEntity<Mensaje>(new Mensaje("Se requiere el link de imagen"), HttpStatus.BAD_REQUEST);
        Educacion educacion = servEducacion.buscarEducacionId(id);
        educacion.setLugar(educacionDto.getLugar());
        educacion.setTitulo(educacionDto.getTitulo());
        educacion.setDesde(educacionDto.getDesde());
        educacion.setHasta(educacionDto.getHasta());
        educacion.setImagen(educacionDto.getImagen());
        servEducacion.crearEducacion(educacion);
            return new ResponseEntity<Mensaje>(new Mensaje("Educacion actualizada"), HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrado(@PathVariable Long id) {
        if(!servEducacion.existeEducacion(id))
            return new ResponseEntity<Mensaje>(new Mensaje("No existe el id"), HttpStatus.NOT_FOUND);
        servEducacion.borrarEducacion(id);
            return new ResponseEntity<Mensaje>(new Mensaje("Educacion borrada"), HttpStatus.OK);
    }
    
}
