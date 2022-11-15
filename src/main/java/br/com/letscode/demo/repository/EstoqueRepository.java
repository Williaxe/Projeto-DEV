package br.com.letscode.demo.repository;

import br.com.letscode.demo.domain.Agencia;
import br.com.letscode.demo.domain.Equipamento;
import br.com.letscode.demo.domain.Estoque;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface EstoqueRepository extends CrudRepository<Estoque, Integer> {

    List<Estoque> findAllByNomeContains(String nome);
    boolean existsByNome(String nome);

    Optional<Estoque> findByNome(String nome);

    Optional<Estoque> findByNomeAndIdJuncao (String nome, Integer idJuncao );

}
