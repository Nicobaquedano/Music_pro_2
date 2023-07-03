package cl.duoc.msintegracionsvc.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data

public class WebPayInitResponse{
    @JsonProperty("token")
    private String token;
    @JsonProperty("url")
    private String url;
}