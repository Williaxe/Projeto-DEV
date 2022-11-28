package br.com.letscode.demo.service;

import br.com.letscode.demo.config.HandlerException;
import br.com.letscode.demo.domain.DCM;
import br.com.letscode.demo.dto.DCMDto;

import java.util.List;

public interface DCMService {

    List<DCM> list(Integer idDcm, String juncaodestinatario, String juncaoremetente);

    DCM save(DCMDto dto) throws HandlerException;

    DCM getById(Integer id);

    DCM update(Integer id, DCM dcm);

    void delete(Integer id);


}

