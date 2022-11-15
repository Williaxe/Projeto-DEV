package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.Endereco;
import br.com.letscode.demo.domain.Equipamento;

import java.util.List;

public interface EquipamentoService {



    Equipamento save(Equipamento equipamento);


    Equipamento getById(Integer id);
    List<Equipamento> getByIdMarca(String marca);
    List<Equipamento> getByIdModelo(String modelo);



    Equipamento update(Integer id, Equipamento equipamento);

    void delete(Integer id);



}