package br.com.letscode.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Equipamento")
@Setter
@NoArgsConstructor
@Getter
@Builder
@AllArgsConstructor
public class Equipamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column(nullable = false)
    private String modelo;
    private String marca;
    private LocalDate dataAquisicao;
    private String tipo;
    private Integer serie;
    private Integer idGestao;
    private String juncaoAtual;
   // private Integer idAgencia;
   // private Integer idEstoque;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Estoque_id")
    @JsonIgnore
    private Estoque estoque;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Agencia_id")
    @JsonIgnore
    private Agencia agencia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Gestao_id")
    @JsonIgnore
    private Gestao gestao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DCM_id")
    @JsonIgnore
    private DCM dcm;

    public Equipamento(String s, String lenovo, int i, Object o, String computador, Object o1, int i1, int i2, Object o2) {
    }

    public void setIdEquipamento(Integer id) {
    }
}

