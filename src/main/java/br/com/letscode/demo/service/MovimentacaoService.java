package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Estoque;
import br.com.letscode.demo.domain.Movimentacao;

import java.util.List;

public interface MovimentacaoService {
    List<Movimentacao> list(String nome);

    Movimentacao save(Movimentacao movimentacao);


    Movimentacao getById(Long id);


    Movimentacao update(Integer id, Movimentacao movimentacao);

    void delete(Long id);

}
