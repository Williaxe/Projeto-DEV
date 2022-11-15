package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Estoque;
import br.com.letscode.demo.domain.Gestao;
import java.util.List;

public interface GestaoService {

    List<Gestao> list(String nome);

    Gestao save(Gestao gestao);

    Gestao getById(Integer id);

    Gestao update(Integer id, Gestao gestao);

    void delete(Long id);
}
