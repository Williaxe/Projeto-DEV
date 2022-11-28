package br.com.letscode.demo.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class DCM {
    @Id

    private Integer idDcm;
    private Integer valor;
    private LocalDate dataMovimentacao;
    private String juncaoRemetente;
    private String juncaoDestinatario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Equipamento_id")
    private Equipamento equipamento;

}
