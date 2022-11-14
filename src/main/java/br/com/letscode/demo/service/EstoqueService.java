package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Equipamento;
import br.com.letscode.demo.domain.Estoque;

import java.util.List;

public interface EstoqueService {


    Estoque save(Estoque estoque);


    Estoque getById(Integer id);


    Estoque update(Integer id, Estoque estoque);

    void delete(Integer id);

}
