package cl.duoc.msintegracionsvc.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Crea los constructores 
@NoArgsConstructor
public class UsuarioDTO {
    @JsonProperty("user-name")
    private String nombre;
    @JsonProperty("user-id")
    private Long id;
    @JsonProperty("user-mail")
    private String correo;
    @JsonProperty("type-user-name")
    private TipoUsuarioDTO tipo;
}
