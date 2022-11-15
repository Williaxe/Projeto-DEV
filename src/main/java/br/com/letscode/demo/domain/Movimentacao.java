package br.com.letscode.demo.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table
@Setter
@Getter

public class Movimentacao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Integer id;


    @OneToMany(mappedBy = "movimentacao")
    @JsonIgnoreProperties("movimentacao")
    private Set<Equipamento> equipamentos;

    @OneToMany(mappedBy = "movimentacao")
    @JsonIgnoreProperties("movimentacao")
    private Set<DCM> dcms;
}
