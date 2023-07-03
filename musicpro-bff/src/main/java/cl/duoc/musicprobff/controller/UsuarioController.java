package cl.duoc.musicprobff.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario-bff")
public class UsuarioController {

    public class Usuario {
        private Long id;
        private String nombre;
        private String pass;
        private String correo;
        private String fecNac;
        private String Direccion;
    }

    @PostMapping(path = "/usuario", consumes = { "aplplication/json"}, produces = {"application/json"})
    public ResponseEntity<Usuario> agregarUsuario(@RequestBody Usuario UsuarioService){
        return ResponseEntity.ok().body(UsuarioService);
    }
}
