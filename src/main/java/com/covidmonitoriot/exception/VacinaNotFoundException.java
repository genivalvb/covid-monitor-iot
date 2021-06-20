package com.covidmonitoriot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class VacinaNotFoundException extends Exception{
    public VacinaNotFoundException(String code) {
        super(String.format("Vacina with code %s not found in the system.", code));
    }

    public VacinaNotFoundException(Long id) {

        super(String.format("Vacina with id %s not found in the system.", id));
    }
}
