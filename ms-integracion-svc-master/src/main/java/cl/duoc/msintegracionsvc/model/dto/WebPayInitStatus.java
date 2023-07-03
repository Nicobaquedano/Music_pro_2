package cl.duoc.msintegracionsvc.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class WebPayInitStatus {
    @JsonProperty("vci")
    private String vci;
    @JsonProperty("amount")
    private double amount;
    @JsonProperty("status")
    private String status;
    @JsonProperty("buy_order")
    private String buyOrder;
    @JsonProperty("session_id")
    private String sessionId;
    @JsonProperty("card_number")
    private String cardNumber;
    @JsonProperty("accounting_date")
    private String accountingDate;
    @JsonProperty("transaction_date")
    private String transactionDate;
    @JsonProperty("authorization_code")
    private String authorizationCode;
    @JsonProperty("payment_type_code")
    private String paymentTypeCode;
    @JsonProperty("response_code")
    private byte responseCode;
    @JsonProperty("installments_number")
    private byte installmentsNumber;
    @JsonProperty("card_detail")
    private String cardDetail;
}
