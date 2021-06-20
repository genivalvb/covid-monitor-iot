package com.covidmonitoriot.mapper;

import com.covidmonitoriot.dto.CoordenadaDTO;
import com.covidmonitoriot.dto.VacinaDTO;
import com.covidmonitoriot.entity.Coordenada;
import com.covidmonitoriot.entity.Vacina;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VacinaMapper {

    VacinaMapper INSTANCE = Mappers.getMapper(VacinaMapper.class);

    Vacina toModel(VacinaDTO vacinaDTO);

    VacinaDTO toDTO(Vacina vacina);
}
