package br.com.letscode.demo.repository;

import br.com.letscode.demo.domain.DCM;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface DCMRepository extends CrudRepository<DCM, Integer> {

    List<DCM> findAllByJuncaoDestinatarioAndJuncaoRemetente(String juncaoDestinatario, String juncaoRemetente);

    Optional<DCM> findByjuncaoRemetente (String juncaoRemetente );
    Optional<DCM> findByjuncaoDestinatario (String juncaoDestinatario );
}


