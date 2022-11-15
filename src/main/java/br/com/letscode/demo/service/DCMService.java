package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Agencia;
import br.com.letscode.demo.domain.DCM;
import java.util.List;

public interface DCMService {

    List<DCM> list(Integer idDcm, String juncaodestinatario, String juncaoremetente);

    DCM save(DCM dcm);

    DCM getById(Integer id);

    DCM update(Integer id, DCM dcm);

    void delete(Integer id);
}
