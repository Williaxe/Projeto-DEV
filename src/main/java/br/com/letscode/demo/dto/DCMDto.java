package br.com.letscode.demo.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DCMDto implements Serializable {
    private Integer idDcm;
    private Integer valor;
    private LocalDate dataMovimentacao;
    private String juncaoRemetente;
    private String juncaoDestinatario;

    @NotNull
    private Integer idEquipamento;
}