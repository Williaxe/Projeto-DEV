package br.com.letscode.demo.repository;

import br.com.letscode.demo.domain.Equipamento;
import br.com.letscode.demo.domain.Estoque;
import br.com.letscode.demo.domain.Gestao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GestaoRepository extends CrudRepository<Gestao, Integer> {

    Object findAllByDepartamentoContains(String departamento);

    void deleteById(Integer id);
}
