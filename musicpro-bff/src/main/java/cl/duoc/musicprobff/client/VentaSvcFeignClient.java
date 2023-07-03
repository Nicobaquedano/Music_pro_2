package cl.duoc.musicprobff.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import cl.duoc.musicprobff.model.dto.WebPayInitTransactionDTO;

@FeignClient(name = "svc-venta", url = "http://localhost:8181/ventas-svc")
public interface VentaSvcFeignClient {
    @PostMapping(path = "/iniciar-trx", produces = {"application/json"})
    public List<WebPayInitTransactionDTO> initTrax();
}
