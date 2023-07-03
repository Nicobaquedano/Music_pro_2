package cl.duoc.musicprobff.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import cl.duoc.musicprobff.model.dto.InstrumentoDTO;

@FeignClient(name = "svc-instrumento", url = "http://localhost:8181/instrumentos-svc")
public interface InstrumentoSvcFeignClient {

    @GetMapping(path = "/get-all", produces = {"application/json"})
    public List<InstrumentoDTO> findAll();
} 
    

