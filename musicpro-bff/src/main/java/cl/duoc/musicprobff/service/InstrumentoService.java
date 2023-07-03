package cl.duoc.musicprobff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.musicprobff.client.InstrumentoSvcFeignClient;

@Service
public class InstrumentoService {
    @Autowired
    InstrumentoSvcFeignClient instrumentoSvcFeignClient;
    
}
