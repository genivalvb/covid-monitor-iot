package com.covidmonitoriot.repository;

import com.covidmonitoriot.entity.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VacinaRepository extends JpaRepository<Vacina, Long> {

    Optional<Vacina> findByCode(String code);
}
