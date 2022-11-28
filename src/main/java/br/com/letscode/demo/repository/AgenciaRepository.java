package br.com.letscode.demo.repository;

import br.com.letscode.demo.domain.Agencia;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface AgenciaRepository extends CrudRepository<Agencia, Integer> {

    List<Agencia> findAllByNomeContains(String nome);
    boolean existsByNome(String nome);

   Optional<Agencia> findByNome(String nome);

   Optional<Agencia> findByNomeAndIdJuncao (String nome, Integer idJuncao);

}

