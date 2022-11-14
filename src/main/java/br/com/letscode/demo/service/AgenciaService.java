package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Agencia;
import br.com.letscode.demo.domain.Endereco;

import java.util.List;

public interface AgenciaService {
    List<Agencia> list(String nome);
    Agencia save(Agencia agencia);

    Agencia getById(Integer id);

    Agencia update(Integer id, Agencia agencia);

    void delete(Integer id);

    Endereco buscaEndereco(String nome, Integer idJuncao) throws Exception;
}
