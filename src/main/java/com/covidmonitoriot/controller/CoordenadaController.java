package com.covidmonitoriot.controller;

import com.covidmonitoriot.dto.CoordenadaDTO;
import com.covidmonitoriot.dto.MessageResponseDTO;
import com.covidmonitoriot.entity.Coordenada;
import com.covidmonitoriot.exception.CoordenadaNotFoundException;
import com.covidmonitoriot.repository.CoordenadaRepository;
import com.covidmonitoriot.service.CoordenadaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/v1/coordenadas")
@AllArgsConstructor
public class CoordenadaController {

    @Autowired
    private CoordenadaService coordenadaService;

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid CoordenadaDTO coordenadaDTO){
        return coordenadaService.create(coordenadaDTO);
    }

    @GetMapping("/id/{id}")
    public CoordenadaDTO findById(@PathVariable Long id) throws CoordenadaNotFoundException {
        return coordenadaService.findById(id);
    }

}
