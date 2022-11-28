package br.com.letscode.demo.repository;

import br.com.letscode.demo.domain.Gestao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestaoRepository extends JpaRepository<Gestao, Integer> {

    Object findAllByDepartamentoContains(String departamento);

    void deleteById(Integer id);
}
