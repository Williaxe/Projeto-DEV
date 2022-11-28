package br.com.letscode.demo.repository;

import br.com.letscode.demo.domain.Equipamento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EquipamentoRepository extends CrudRepository<Equipamento, Integer> {

    List<Equipamento>findAllByMarca(String marca);
    List<Equipamento>findAllByModelo(String modelo);

    void deleteById(Integer id);
}

