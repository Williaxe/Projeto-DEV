package br.com.letscode.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Setter
@Getter

public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private Integer juncao;
    private String logradouro;
    private Integer numero;
    private String complemento;
    private String bairro;
    private String cidade;

    public void setIdEndereco(Integer id) {
    }
}
