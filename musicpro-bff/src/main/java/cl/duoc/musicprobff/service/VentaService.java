package cl.duoc.musicprobff.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.musicprobff.model.dto.WebPayInitTransactionDTO;

@Service
public class VentaService {
    @Autowired
    WebPayInitTransactionDTO webPayInitTransactionDTO;
}
