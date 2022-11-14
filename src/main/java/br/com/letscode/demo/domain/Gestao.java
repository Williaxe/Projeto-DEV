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

public class Gestao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String departamento;

    @OneToMany(mappedBy = "gestao")
    @JsonIgnoreProperties("gestao")
    private Set<Equipamento> equipamentos;

}
