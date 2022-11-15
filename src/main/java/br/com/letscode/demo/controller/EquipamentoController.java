package br.com.letscode.demo.controller;

import br.com.letscode.demo.domain.Agencia;
import br.com.letscode.demo.domain.Endereco;
import br.com.letscode.demo.domain.Equipamento;
import br.com.letscode.demo.service.EquipamentoService;
import br.com.letscode.demo.service.EquipamentosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/Equipamentos")
public class EquipamentoController {

    private EquipamentoService equipamentoService;

   public EquipamentoController(EquipamentoService equipamentoService){
       this.equipamentoService = equipamentoService;
    }

    @GetMapping("/marca/{marca}")
    public List<Equipamento> buscaEquipamentoMarca(@PathVariable(value = "marca")String marca){
        return equipamentoService.getByIdMarca(marca);
    }

    @GetMapping("/modelo/{modelo}")
    public List<Equipamento> buscaEquipamentoModelo(@PathVariable(value = "modelo")String modelo){
        return equipamentoService.getByIdModelo(modelo);
    }

    @PostMapping
    public Equipamento adicionaEquipamento(@RequestBody Equipamento equipamento){
        return equipamentoService.save(equipamento);
    }
}