package br.com.letscode.demo.domain;


import lombok.Builder;
import lombok.Getter;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor


public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(nullable = false)
    private String modelo;
    private String marca;
    private LocalDateTime dataAquisicao;
    private String tipo;
    private Integer serie;
    private Integer idGestao;
   // private Integer idAgencia;
   // private Integer idEstoque;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Estoque_id")
    private Estoque estoque;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Agencia_id")
    private Agencia agencia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Gestao_id")
    private Gestao gestao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Movimentacao_id")
    private Movimentacao movimentacao;


    public Equipamento(String s, String lenovo, int i, Object o, String computador, Object o1, int i1, int i2, Object o2) {

    }

    public void setIdEquipamento(Integer id) {
    }
}

