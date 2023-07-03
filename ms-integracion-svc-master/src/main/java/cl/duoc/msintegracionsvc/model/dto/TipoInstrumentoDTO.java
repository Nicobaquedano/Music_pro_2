package cl.duoc.msintegracionsvc.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TipoInstrumentoDTO {
    @JsonProperty("type-instrumento-name")
    private String nombre;
    @JsonProperty("type-instrumento-id")
    private Long id;
}
