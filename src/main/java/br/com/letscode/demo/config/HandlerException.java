package br.com.letscode.demo.config;

import br.com.letscode.demo.domain.DCM;
import br.com.letscode.demo.dto.DCMDto;
import br.com.letscode.demo.repository.DCMRepository;
import br.com.letscode.demo.repository.EquipamentoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class HandlerException extends Throwable {

    @Autowired
    private EquipamentoRepository equipamentoRepository;

    @Autowired
    private DCMRepository dcmRepository;


    public HandlerException(String equipamento_não_localizado) {
    }


    @ExceptionHandler
    public DCM save(DCMDto dto) throws HandlerException {
        var equipamento = equipamentoRepository.findById(dto.getIdEquipamento());
        if (equipamento.isEmpty()) {
            throw new HandlerException("Equipamento não localizado");
        }
        if (equipamento.get().getJuncaoAtual().equalsIgnoreCase(dto.getJuncaoRemetente())) {
            var dcm = DCM.builder()
                    .idDcm(dto.getIdDcm())
                    .valor(dto.getValor())
                    .dataMovimentacao(dto.getDataMovimentacao())
                    .juncaoRemetente(dto.getJuncaoRemetente())
                    .juncaoDestinatario(dto.getJuncaoDestinatario())
                    .equipamento(equipamento.get())
                    .build();

            return dcmRepository.save(dcm);
        }
        throw new HandlerException("Equipamento não consta na junção") ;



    }
}
