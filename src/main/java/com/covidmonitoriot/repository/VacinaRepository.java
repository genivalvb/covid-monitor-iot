package com.covidmonitoriot.repository;

import com.covidmonitoriot.entity.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacinaRepository extends JpaRepository<Vacina, Long> {
}
