package com.covidmonitoriot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CoordenadaNotFoundException extends Exception{
    public CoordenadaNotFoundException(String coordenada) {
        super(String.format("Coordenada with name %s not found in the system.", coordenada));
    }

    public CoordenadaNotFoundException(Long id) {

        super(String.format("Coordenada with id %s not found in the system.", id));
    }
}
