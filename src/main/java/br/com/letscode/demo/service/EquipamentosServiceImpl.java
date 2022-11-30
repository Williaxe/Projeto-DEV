package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Equipamento;
import br.com.letscode.demo.repository.EquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("equipamentos")
public class EquipamentosServiceImpl implements EquipamentoService{

    @Autowired
    public EquipamentoRepository equipamentoRepository;

    @Override
    public Equipamento save(Equipamento equipamento) {
        return equipamentoRepository.save(equipamento);
    }

    @Override
    public Equipamento getById(Integer id) {
        return equipamentoRepository.findById(id).get();
    }

    @Override
    public List<Equipamento> getByIdMarca(String marca) {
 //       return (List<Equipamento>) equipamentoRepository.findAllByMarca(marca);
        return (List<Equipamento>) equipamentoRepository.findAll();
  }

    @Override
    public List<Equipamento> getByIdModelo(String modelo) {
        return equipamentoRepository.findAllByModelo(modelo);
    }

    @Override
    public Equipamento update(Integer id, Equipamento equipamento) {
        equipamento.setId(id);
        return equipamentoRepository.save(equipamento);
    }

}
