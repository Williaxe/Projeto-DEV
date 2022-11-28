package br.com.letscode.demo.controller;

import br.com.letscode.demo.domain.Equipamento;
import br.com.letscode.demo.service.EquipamentoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletaEquipamento(@PathVariable (value = "id") Integer id) throws Exception {
        equipamentoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public Equipamento alterarEquipamento(@PathVariable(value = "id")Integer idEquipamento,
                                          @RequestBody Equipamento equipamento){
        return equipamentoService.update(idEquipamento, equipamento);
    }





}