package br.com.letscode.demo.service;

import br.com.letscode.demo.config.HandlerException;
import br.com.letscode.demo.domain.DCM;
import br.com.letscode.demo.dto.DCMDto;
import br.com.letscode.demo.repository.DCMRepository;
import br.com.letscode.demo.repository.EquipamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor

public class DcmServiceImpl implements DCMService {

    @Autowired
    private DCMRepository dcmRepository;

    @Autowired
    private EquipamentoRepository equipamentoRepository;
    @Override
    public List<DCM> list(Integer idDcm, String juncaoDestinatario, String juncaoRemetente) {
        var dcm = dcmRepository.findById( idDcm);
        if (dcm.isPresent()){
            return Collections.singletonList(dcm.get());
        }
        return dcmRepository.findAllByJuncaoDestinatarioAndJuncaoRemetente(juncaoDestinatario, juncaoRemetente);
    }

    @ExceptionHandler
    public DCM save(DCMDto dto) throws HandlerException {
       var equipamento = equipamentoRepository.findById(dto.getIdEquipamento());
        if (equipamento.isEmpty()){
            throw new HandlerException("Equipamento não localizado");

   //  public DCM save(DCMDto dto) throws HandlerException {
   //      var equipamento = equipamentoRepository.findById(dto.getIdEquipamento());
    //    if (equipamento.isEmpty()){
    //        throw new HandlerException("Equipamento não localizado");
        }
        if (equipamento.get().getJuncaoAtual().equalsIgnoreCase(dto.getJuncaoRemetente())){
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

    @Override
    public DCM getById(Integer id) {
        return dcmRepository.findById(id).get();
    }

    @Override
    public DCM update(Integer id, DCM dcm) {
        dcm.setIdDcm(id);
        return dcmRepository.save(dcm);
    }

    @Override
    public void delete(Integer id) {
        dcmRepository.deleteById(id);
    }

       }



