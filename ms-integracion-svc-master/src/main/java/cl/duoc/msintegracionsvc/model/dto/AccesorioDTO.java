package cl.duoc.msintegracionsvc.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccesorioDTO {
    @JsonProperty("accesorio-id")
    private long id;
    private String nombre;
    private CategoriaDTO categoria;
    private int precio;
    private String Descripcion;
}
