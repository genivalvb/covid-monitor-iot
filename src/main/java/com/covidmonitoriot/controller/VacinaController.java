package com.covidmonitoriot.controller;

import com.covidmonitoriot.dto.CoordenadaDTO;
import com.covidmonitoriot.dto.MessageResponseDTO;
import com.covidmonitoriot.dto.VacinaDTO;
import com.covidmonitoriot.exception.VacinaNotFoundException;
import com.covidmonitoriot.service.VacinaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/vacinas")
@AllArgsConstructor
public class VacinaController {

    @Autowired
    private VacinaService vacinaService;

    @PostMapping
    public MessageResponseDTO create(@RequestBody @Valid VacinaDTO vacinaDTO){
        return vacinaService.create(vacinaDTO);
    }

    @GetMapping("/id/{id}")
    public VacinaDTO findById(@PathVariable Long id) throws VacinaNotFoundException {
        return vacinaService.findById(id);
    }

    @GetMapping
    public List<VacinaDTO> listVacinas() {
        return vacinaService.listAll();
    }

}
