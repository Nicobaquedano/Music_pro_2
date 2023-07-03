package cl.duoc.msintegraciondb.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OrdenCompraDTO {
    @JsonProperty("despacho-id")
    private long id;
    private String direccion;
    private String producto;
    private SucursalDTO sucursal;
    private SucursalDTO manager;
    private UsuarioDTO cliente;
    private UsuarioDTO vendedor;
}
