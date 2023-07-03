package cl.duoc.msintegracionsvc.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import cl.duoc.msintegracionsvc.model.dto.UsuarioDTO;


@FeignClient(name = "/svc-usuarios-db", url = "http://localhost:8282/usuarios-db")
public interface UsuarioDbFeignClient {
    @GetMapping(path = "/get-all", produces = {"application/json"})
    public List<UsuarioDTO> findAll();
}
