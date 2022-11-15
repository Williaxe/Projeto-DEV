package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Estoque;
import br.com.letscode.demo.domain.Gestao;
import java.util.List;

public interface GestaoService {

    List<Gestao> list();

    Gestao save(Gestao gestao);

    void delete(Integer id);
}
