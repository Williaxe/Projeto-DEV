package br.com.letscode.demo.service;
import br.com.letscode.demo.service.EstoqueService;


import br.com.letscode.demo.domain.Endereco;
import br.com.letscode.demo.domain.Estoque;

import java.util.List;

public interface EstoqueService {

    List<Estoque> list(String nome);


    Estoque save(Estoque estoque);


    Estoque getById(Integer id);


    Estoque update(Integer id, Estoque estoque);

    void delete(Integer id);

    Endereco buscaEndereco(String nome, Integer idJuncao) throws Exception;
}
