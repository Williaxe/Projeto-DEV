package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Gestao;
import br.com.letscode.demo.repository.GestaoRepository;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//public class GestaoServiceImpl implements GestaoService{

//    @Autowired
//    private GestaoRepository gestaoRepository;

//    @Override
//    public List<Gestao> list(String departamento) {
//
//        if (departamento == null) {
//            return IterableUtils.toList(gestaoRepository.findAll());
//        }
//        return IterableUtils.toList(gestaoRepository.findAllByDepartamentoContains(departamento));
//    }

//    @Override
//    public Gestao save(Gestao gestao) {
//        return gestaoRepository.save(gestao);
//    }
//
//    @Override
//    public Gestao getById(Integer id) {
//        return gestaoRepository.findById(id).get();
//    }
//
//    @Override
//    public Gestao getById(Integer id) {
//
//        return gestaoRepository.findById(id).get();
//    }
//
//    @Override
//    public Gestao update(Integer id, Gestao gestao) {
//        gestao.setId(id);
//        return gestaoRepository.save(gestao);
//    }
//
//    @Override
//    public void delete(Long id) {
//        gestaoRepository.deleteById(id);
//
//    }
//}
