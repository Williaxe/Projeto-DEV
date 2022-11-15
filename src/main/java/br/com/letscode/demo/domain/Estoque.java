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

public class Estoque {
    @Id

    private Integer idJuncao;
    private String nome;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;

    @OneToMany(mappedBy = "estoque")
    @JsonIgnoreProperties("estoque")
    private Set<Equipamento> equipamentos;

    public void setIdEstoque(Integer id) {
    }
}
