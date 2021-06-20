package com.covidmonitoriot.dto;

import com.covidmonitoriot.entity.Vacina;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoordenadaDTO {

    private Long id;

    @NotNull
    @Size(max = 200)
    private String coordenada;

    private String data_coordenada;

    @Valid
    @NotNull
    private VacinaDTO vacina;
}
