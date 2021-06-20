package com.covidmonitoriot.repository;

import com.covidmonitoriot.entity.Coordenada;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordenadaRepository extends JpaRepository<Coordenada, Long> {
}
