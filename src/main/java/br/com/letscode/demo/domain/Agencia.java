package br.com.letscode.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Agencia {
    @Id
    private Integer idJuncao;
    private String nome;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;

    @OneToMany(mappedBy = "agencia")
    @JsonIgnoreProperties("agencia")
    private List<Equipamento> equipamentos;

}
