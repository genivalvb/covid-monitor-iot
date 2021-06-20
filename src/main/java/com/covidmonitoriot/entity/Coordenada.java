package com.covidmonitoriot.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Coordenada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String coordenada;

    //@JsonFormat(pattern = "yyyy-MM-dd-HH:mm:ss:zz")
    //@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    @Column(name = "data_coordenada")
    private String data_coordenada;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "vacina_id")
    @JsonBackReference
    private Vacina vacina;

}
