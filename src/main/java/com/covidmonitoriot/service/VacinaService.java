package com.covidmonitoriot.service;

import com.covidmonitoriot.dto.CoordenadaDTO;
import com.covidmonitoriot.dto.MessageResponseDTO;
import com.covidmonitoriot.dto.VacinaDTO;
import com.covidmonitoriot.entity.Coordenada;
import com.covidmonitoriot.entity.Vacina;
import com.covidmonitoriot.exception.CoordenadaNotFoundException;
import com.covidmonitoriot.exception.VacinaNotFoundException;
import com.covidmonitoriot.mapper.CoordenadaMapper;
import com.covidmonitoriot.mapper.VacinaMapper;
import com.covidmonitoriot.repository.CoordenadaRepository;
import com.covidmonitoriot.repository.VacinaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class VacinaService {

    @Autowired
    private VacinaRepository vacinaRepository;

    private final VacinaMapper vacinaMapper = VacinaMapper.INSTANCE;

    public MessageResponseDTO create(VacinaDTO vacinaDTO){
        Vacina vacinaToSave = vacinaMapper.toModel(vacinaDTO);
        Vacina savedVacina = vacinaRepository.save(vacinaToSave);
        return MessageResponseDTO.builder()
                .message("Vacina criada com ID " + savedVacina.getId())
                .build();
    }

    public VacinaDTO findByCode(String code) throws VacinaNotFoundException {
        Vacina vacinaEncontrada = vacinaRepository.findByCode(code)
                .orElseThrow(() -> new VacinaNotFoundException(code));
        return vacinaMapper.toDTO(vacinaEncontrada);
    }

    public VacinaDTO findById(Long id) throws VacinaNotFoundException {
        Vacina vacinaEncontrada = vacinaRepository.findById(id)
                .orElseThrow(() -> new VacinaNotFoundException(id));
        return vacinaMapper.toDTO(vacinaEncontrada);
    }

    public List<VacinaDTO> listAll() {
        return vacinaRepository.findAll()
                .stream()
                .map(vacinaMapper::toDTO)
                .collect(Collectors.toList());
    }
/*
    public CoordenadaDTO findByVacinaName(String vacinaName) throws CoordenadaNotFoundException {
        Coordenada coordenadaEncontrada = coordenadaRepository.findById()
                .orElseThrow(() -> new CoordenadaNotFoundException(id));
        return coordenadaMapper.toDTO(coordenadaEncontrada);
    }*/
}
