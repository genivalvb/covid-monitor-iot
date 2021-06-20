package com.covidmonitoriot.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.hibernate.annotations.Type;

import javax.persistence.*;
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
    private String data_envio;

    @Type(type = "jsonb")
    @Basic(fetch = FetchType.LAZY)
    @OneToMany(mappedBy = "vacina")
    @JsonManagedReference
    private List<Coordenada> coordenadas;
}
