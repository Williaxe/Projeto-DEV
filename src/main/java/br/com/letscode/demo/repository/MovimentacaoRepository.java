package br.com.letscode.demo.repository;

import br.com.letscode.demo.domain.Gestao;
import br.com.letscode.demo.domain.Movimentacao;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MovimentacaoRepository extends CrudRepository<Movimentacao, Integer> {

}
