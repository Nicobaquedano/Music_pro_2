package cl.duoc.musicprobff.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Identifica que es un microservicio
@RequestMapping("/instrumentos-bff") // Se especifica la ruta que se le agregara al endpoint para poder acceder al
                                     // controlador (Ej: "/instrumentos-bff")
public class InstrumentoController {

    public class Instrumento {
        private Long id;
        private String nombre;
        private String tipo;
        private Integer precio;

    }

    @PostMapping(path = "/instrumento", consumes = { "application/json" }, produces = { "application/json" })
    public ResponseEntity<Instrumento> agregarInstrumento(@RequestBody Instrumento instrumentoService) {
        return ResponseEntity.ok().body(instrumentoService); // Retornara positivo si se agrego el instrumento
    }


}