package com.covidmonitoriot.mapper;

import com.covidmonitoriot.dto.CoordenadaDTO;
import com.covidmonitoriot.entity.Coordenada;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CoordenadaMapper {

    CoordenadaMapper INSTANCE = Mappers.getMapper(CoordenadaMapper.class);

    Coordenada toModel(CoordenadaDTO coordenadaDTO);

    CoordenadaDTO toDTO(Coordenada coordenada);
}
