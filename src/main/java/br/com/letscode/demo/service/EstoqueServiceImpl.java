package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Endereco;
import br.com.letscode.demo.domain.Estoque;
import br.com.letscode.demo.repository.EstoqueRepository;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstoqueServiceImpl implements EstoqueService {

    @Autowired
    public EstoqueRepository estoqueRepository;

    @Override
    public List<Estoque> list(String nome) {
        if (nome == null) {
            return IterableUtils.toList(estoqueRepository.findAll());
        }
        return IterableUtils.toList(estoqueRepository.findAllByNomeContains(nome));
    }

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

    @Override
    public Endereco buscaEndereco(String nome, Integer idJuncao) throws Exception {
        var estoqueJuncao = estoqueRepository.findById(idJuncao);
        if(estoqueJuncao.isEmpty()){
            var estoqueNome = estoqueRepository.findByNome(nome);
            if(estoqueNome.isEmpty()){
                throw new Exception("Estoque não localizada");
            }
            return estoqueNome.get().getEndereco();
        }
        return estoqueJuncao.get().getEndereco();
    }
}
