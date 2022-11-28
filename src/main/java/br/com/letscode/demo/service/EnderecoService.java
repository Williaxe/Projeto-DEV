package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Endereco;

import java.util.List;

public interface EnderecoService {

    Endereco save(Endereco endereco);

    Endereco getById(Long id);

    Endereco update(Integer id, Endereco endereco);

    void delete(Long id);

    List<Endereco> getAllEndereco();
}

