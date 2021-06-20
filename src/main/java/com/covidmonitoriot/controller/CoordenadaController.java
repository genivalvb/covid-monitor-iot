package com.covidmonitoriot.controller;

import com.covidmonitoriot.dto.MessageResponseDTO;
import com.covidmonitoriot.entity.Coordenada;
import com.covidmonitoriot.repository.CoordenadaRepository;
import com.covidmonitoriot.service.CoordenadaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/coordenadas")
@AllArgsConstructor
public class CoordenadaController {

    @Autowired
    private CoordenadaService coordenadaService;

    @PostMapping
    public MessageResponseDTO create(@RequestBody Coordenada coordenada){
        return coordenadaService.create(coordenada);
    }
}
