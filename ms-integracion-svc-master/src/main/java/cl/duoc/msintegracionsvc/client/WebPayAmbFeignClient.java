package cl.duoc.msintegracionsvc.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import cl.duoc.msintegracionsvc.model.dto.WebPayInitResponse;
import cl.duoc.msintegracionsvc.model.dto.WebPayInitStatus;
import cl.duoc.msintegracionsvc.model.dto.WebPayInitTransactionDTO;


@FeignClient(name = "svc-webpay-amb", url = "https://webpay3gint.transbank.cl")
public interface WebPayAmbFeignClient {
    
    @PostMapping(path = "/transactions", produces = {"application/json"})
    public WebPayInitResponse createTransaction(@RequestHeader("Tbk-Api-Key-Id") String tbkApiKeyId,
                                    @RequestHeader("Tbk-Api-Key-Secret") String tbkApiKeySecret,
                                    @RequestBody WebPayInitTransactionDTO webPayInitTransactionDTO);
    public WebPayInitStatus statusTransaction(String webPayApiKeyId, String webPayApiKeySecret, WebPayInitTransactionDTO webPayInitTransactionDTO); 
}
