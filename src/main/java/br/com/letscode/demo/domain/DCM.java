package br.com.letscode.demo.domain;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Setter
@Getter

public class DCM {
    @Id

    private Integer idDcm;
    private Integer valor;
    private LocalDateTime dataMovimentacao;
    private String juncaoRemetente;
    private String juncaoDestinatario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Movimentacao_id")
    private Movimentacao movimentacao;






}
