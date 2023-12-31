package cl.duoc.musicprobff.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InstrumentoDTO {
    
    @JsonProperty("idInstrumento")
    private int id;
    private String nombre;
    @JsonProperty("categoria_instrumento")
    private CategoriaDTO categoria;
    @JsonProperty("instrumento-marca")
    private MarcaDTO marca;
    @JsonProperty("instrumento-tipo")
    private TipoInstrumentoDTO tipo;                                   
    private String descripcion;
    private int precio;
    private int stock;
    private int cuerdas;
}

