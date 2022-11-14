package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Estoque;
import br.com.letscode.demo.repository.EstoqueRepository;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EstoqueServiceImpl implements EstoqueService {

    @Autowired
    public EstoqueRepository estoqueRepository;


    @Override
    public Estoque save(Estoque estoque) {

        return estoqueRepository.save(estoque);
    }

    @Override
    public Estoque getById(Integer id) {
        return estoqueRepository.findById(id).get();
    }

    @Override
    public Estoque update(Integer id, Estoque estoque) {
        estoque.setIdEstoque(id);
        return estoqueRepository.save(estoque);

    }

    @Override
    public void delete(Integer id) {
        estoqueRepository.deleteById(id);

    }
}
