package com.covidmonitoriot.controller;

import com.covidmonitoriot.dto.CoordenadaDTO;
import com.covidmonitoriot.exception.CoordenadaNotFoundException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;

@Api("Manages beer stock")
public interface CoordenadaDocs {



    @ApiOperation(value = "Returns beer found by a given id")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success coordenada found in the system"),
            @ApiResponse(code = 404, message = "Coordenada with given id not found.")
    })
    CoordenadaDTO findById(@PathVariable Long id) throws CoordenadaNotFoundException;
}
