package com.covidmonitoriot.service;

import com.covidmonitoriot.dto.MessageResponseDTO;
import com.covidmonitoriot.entity.Coordenada;
import com.covidmonitoriot.repository.CoordenadaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@AllArgsConstructor
public class CoordenadaService {

    @Autowired
    private CoordenadaRepository coordenadaRepository;

    public MessageResponseDTO create(Coordenada coordenada){
        Coordenada saveCoordenada = coordenadaRepository.save(coordenada);
        return MessageResponseDTO.builder()
                .message("Coordenada criada com ID " + coordenada.getId())
                .build();
    }
}
