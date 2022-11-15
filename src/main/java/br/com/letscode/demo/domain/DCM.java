package br.com.letscode.demo.domain;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.*;

import javax.persistence.*;

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
    @JoinColumn(name = "Movimentacao_id")
    private Movimentacao movimentacao;






}
