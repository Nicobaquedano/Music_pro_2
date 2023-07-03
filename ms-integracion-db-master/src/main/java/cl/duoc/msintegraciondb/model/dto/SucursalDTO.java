package cl.duoc.msintegraciondb.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SucursalDTO {
    @JsonProperty("sucursal-id")
    private int id;
    private String nombre;
    private String direccion;
    @JsonProperty("sucursal-manager")
    private UsuarioDTO manager;
}
