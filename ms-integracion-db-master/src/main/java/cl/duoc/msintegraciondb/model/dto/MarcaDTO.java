package cl.duoc.msintegraciondb.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MarcaDTO {
    @JsonProperty("marca-id")
    private int id;
    @JsonProperty("marca-name")
    private String name;
}
