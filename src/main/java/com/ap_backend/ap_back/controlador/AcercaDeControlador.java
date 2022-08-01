package com.ap_backend.ap_back.controlador;

import java.util.List;

import com.ap_backend.ap_back.dto.AcercaDeDTO;
import com.ap_backend.ap_back.dto.Mensaje;
import com.ap_backend.ap_back.entidades.AcercaDe;
import com.ap_backend.ap_back.servicios.IAcercaDeServicios;

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
@RequestMapping("/acercade")
@CrossOrigin(origins = "*")
public class AcercaDeControlador {

    @Autowired
    private IAcercaDeServicios servAcercaDe;

    @GetMapping("/ver/acercade")
    public ResponseEntity<List<AcercaDe>> lista() {
        List<AcercaDe> lista = servAcercaDe.listado();
        return new ResponseEntity<List<AcercaDe>>(lista, HttpStatus.OK);
    }

    @GetMapping("/obtener/acercade/{id}")
    public ResponseEntity<?> buscarAcercaDeId(@PathVariable Long id) {
        if (!servAcercaDe.existeAcercaDe(id))
            return new ResponseEntity<Mensaje>(new Mensaje("Id no existe!!"), HttpStatus.NOT_FOUND);
        AcercaDe acercade = servAcercaDe.buscarAcercaDeId(id);
        return new ResponseEntity<AcercaDe>(acercade, HttpStatus.OK);
    }
    
    @PostMapping("/crear")
    public ResponseEntity<?> crearAcercaDe(@RequestBody AcercaDeDTO acercaDto) {

        if(!StringUtils.hasText(acercaDto.getDescripcion()))
           return new ResponseEntity<Mensaje>(new Mensaje("La descripcion es requerida"),HttpStatus.BAD_REQUEST);
        AcercaDe acercade = new AcercaDe(acercaDto.getDescripcion());
        servAcercaDe.crearAcercaDe(acercade);
        return new ResponseEntity<Mensaje>(new Mensaje("Descripcion Acerca De creada"),HttpStatus.OK);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<?> actualizar(@PathVariable Long id, @RequestBody AcercaDeDTO acercadeDto) {
        if(!servAcercaDe.existeAcercaDe(id))
            return new ResponseEntity<Mensaje>(new Mensaje("Id no existe"), HttpStatus.NOT_FOUND);
        if(!StringUtils.hasText(acercadeDto.getDescripcion()))
            return new ResponseEntity<Mensaje>(new Mensaje("La descripcion es requerida"),HttpStatus.BAD_REQUEST);
        AcercaDe acercade = servAcercaDe.buscarAcercaDeId(id);
        acercade.setDescripcion(acercadeDto.getDescripcion());
        servAcercaDe.crearAcercaDe(acercade);
        return new ResponseEntity<Mensaje>(new Mensaje("Descripcion Acerca De actualizada"),HttpStatus.OK);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borrado(@PathVariable Long id) {
        if(!servAcercaDe.existeAcercaDe(id))
            return new ResponseEntity<Mensaje>(new Mensaje("Id no existe"),HttpStatus.NOT_FOUND);
        servAcercaDe.borrarAcercaDe(id);
        return new ResponseEntity<Mensaje>(new Mensaje("Descripcion Acerca De borrada"), HttpStatus.OK);
    }
    
}
