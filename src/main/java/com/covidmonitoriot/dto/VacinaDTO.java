package com.covidmonitoriot.dto;

import com.covidmonitoriot.entity.Coordenada;
import com.covidmonitoriot.entity.Vacina;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Local;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VacinaDTO {

    private Long id;

    @NotNull
    @Size(max = 20)
    private String code;

    @NotNull
    private String data_envio;

    private List<Coordenada> coordenadas;
}
