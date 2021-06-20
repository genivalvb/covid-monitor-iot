package com.covidmonitoriot.service;

import com.covidmonitoriot.dto.CoordenadaDTO;
import com.covidmonitoriot.dto.MessageResponseDTO;
import com.covidmonitoriot.entity.Coordenada;
import com.covidmonitoriot.entity.Vacina;
import com.covidmonitoriot.exception.CoordenadaNotFoundException;
import com.covidmonitoriot.exception.VacinaNotFoundException;
import com.covidmonitoriot.mapper.CoordenadaMapper;
import com.covidmonitoriot.repository.CoordenadaRepository;
import com.covidmonitoriot.repository.VacinaRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CoordenadaService {

    @Autowired
    private CoordenadaRepository coordenadaRepository;

    @Autowired
    private VacinaRepository vacinaRepository;

    private final CoordenadaMapper coordenadaMapper = CoordenadaMapper.INSTANCE;

    public MessageResponseDTO create(CoordenadaDTO coordenadaDTO){
        Coordenada coordenadaToSave = coordenadaMapper.toModel(coordenadaDTO);
        Coordenada savedCoordenada = coordenadaRepository.save(coordenadaToSave);
        return MessageResponseDTO.builder()
                .message("Coordenada criada com ID " + savedCoordenada.getId())
                .build();
    }

    public CoordenadaDTO findById(Long id) throws CoordenadaNotFoundException {
        Coordenada coordenadaEncontrada = coordenadaRepository.findById(id)
                .orElseThrow(() -> new CoordenadaNotFoundException(id));
        return coordenadaMapper.toDTO(coordenadaEncontrada);
    }

    public List<CoordenadaDTO> listAll(){
        return coordenadaRepository.findAll()
                .stream()
                .map(coordenadaMapper::toDTO)
                .collect(Collectors.toList());
    }

   /* public CoordenadaDTO findByVacinaCode(String code) throws CoordenadaNotFoundException, VacinaNotFoundException {
        Vacina vacinaEncontrada = vacinaRepository.findByCode(code)
                .orElseThrow(() -> new VacinaNotFoundException(code));

        Coordenada coordenadaEncontrada = coordenadaRepository.find
                .orElseThrow(() -> new CoordenadaNotFoundException(id));
        return coordenadaMapper.toDTO(coordenadaEncontrada);
    }*/
}
