package com.covidmonitoriot.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.Type;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Vacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable = false)
    //@JsonFormat(pattern = "yyyy-MM-dd")
    //@DateTimeFormat(pattern = "dd/MM/yyyy")
    private String data_envio;

    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @OneToMany(mappedBy = "vacina")
    @JsonManagedReference
    private List<Coordenada> coordenadas;
}
