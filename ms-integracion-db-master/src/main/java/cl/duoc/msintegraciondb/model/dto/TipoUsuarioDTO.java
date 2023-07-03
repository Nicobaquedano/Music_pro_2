package cl.duoc.msintegraciondb.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TipoUsuarioDTO {
    @JsonProperty("type-user-name")
    private String nombre;
    @JsonProperty("type-user-id")
    private Long id;
}
