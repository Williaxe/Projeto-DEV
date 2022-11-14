package br.com.letscode.demo.controller;

import br.com.letscode.demo.domain.Equipamento;
import br.com.letscode.demo.service.EquipamentoService;
import br.com.letscode.demo.service.EquipamentosServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/Equipamentos")
public class EquipamentoController {
//    private EquipamentoService equipamentoService;

//    public EquipamentoController(EquipamentoService equipamentoService){
//        this.equipamentoService = equipamentoService;
//    }
//


//    @GetMapping
//    List<Equipamento> list(){
//        return equipamentoService.list();
//    }

}