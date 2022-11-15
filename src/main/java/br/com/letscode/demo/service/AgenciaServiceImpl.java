package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Agencia;
import br.com.letscode.demo.domain.Endereco;
import br.com.letscode.demo.repository.AgenciaRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class AgenciaServiceImpl implements AgenciaService{
    @Autowired
    private AgenciaRepository agenciaRepository;

    @Override
    public List<Agencia> list(String nome) {
        if (nome == null) {
            return IterableUtils.toList(agenciaRepository.findAll());
        }
        return IterableUtils.toList(agenciaRepository.findAllByNomeContains(nome));
    }

    @Override
    public Agencia save(Agencia agencia) {
        return agenciaRepository.save(agencia);
    }

    @Override
    public Agencia getById(Integer id) {
        return agenciaRepository.findById(id).get();
    }

    @Override
    public Agencia update(Integer id, Agencia agencia) {
        agencia.setIdJuncao(id);
        return agenciaRepository.save(agencia);
    }

    @Override
    public void delete(Integer id) {
        agenciaRepository.deleteById(id);
    }

    @Override
    public Endereco buscaEndereco(String nome, Integer idJuncao) throws Exception {
       var agenciaJuncao = agenciaRepository.findById(idJuncao);
       if(agenciaJuncao.isEmpty()){
         var agenciaNome = agenciaRepository.findByNome(nome);
         if(agenciaNome.isEmpty()){
             throw new Exception("Agência não localizada");
         }
         return agenciaNome.get().getEndereco();
       }
       return agenciaJuncao.get().getEndereco();
}
}
