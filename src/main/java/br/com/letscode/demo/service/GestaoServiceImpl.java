package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Gestao;
import br.com.letscode.demo.repository.GestaoRepository;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GestaoServiceImpl implements GestaoService {

    @Autowired
    private GestaoRepository gestaoRepository;

    @Override
    public List<Gestao> list() {
        return gestaoRepository.findAll();
    }

    @Override
    public Gestao save(Gestao gestao) {
        return gestaoRepository.saveAndFlush(gestao);
    }

    @Override
    public void delete(Integer id) {
        gestaoRepository.deleteById(id);
    }
}
