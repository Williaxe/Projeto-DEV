package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Endereco;
import br.com.letscode.demo.repository.EnderecoRepository;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EnderecoServiceImpl implements EnderecoService{

    @Autowired
    public EnderecoRepository enderecoRepository;

    @Override
    public Endereco save(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    @Override
    public Endereco getById(Long id) {
        return enderecoRepository.findById(id).get();
    }

    @Override
    public Endereco update(Integer id, Endereco endereco) {
        endereco.setIdEndereco(id);
        return enderecoRepository.save(endereco);
    }

    @Override
    public void delete(Long id) {
        enderecoRepository.deleteById(id);
    }

    @Override
    public List<Endereco> getAllEndereco() {
        return (List<Endereco>) enderecoRepository.findAll();
    }
}
