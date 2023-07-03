package cl.duoc.msintegracionsvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cl.duoc.msintegracionsvc.client.InstrumentosDbFeignClient;
import cl.duoc.msintegracionsvc.client.WebPayAmbFeignClient;
import cl.duoc.msintegracionsvc.model.dto.WebPayInitResponse;
import cl.duoc.msintegracionsvc.model.dto.WebPayInitStatus;
import cl.duoc.msintegracionsvc.model.dto.WebPayInitTransactionDTO;

@Service
public class VentaService {

    @Autowired
    WebPayAmbFeignClient webPayAmbFeignClient;

    @Autowired
    InstrumentosDbFeignClient instrumentosDbFeignClient;

    @Value("${svc.webpay.id}")
    private String tbkApiKeyId;
    @Value("${svc.webpay.secret}")
    private String tbkApiKeySecret;

    public WebPayInitResponse generarVenta(WebPayInitTransactionDTO webPayInitTransactionDTO) {
        return webPayAmbFeignClient.createTransaction(tbkApiKeyId, tbkApiKeySecret, webPayInitTransactionDTO);
    }

    public WebPayInitStatus statusTransaction(WebPayInitTransactionDTO webPayInitTransactionDTO ){
        return webPayAmbFeignClient.statusTransaction(tbkApiKeyId, tbkApiKeySecret, webPayInitTransactionDTO);
    }
}
