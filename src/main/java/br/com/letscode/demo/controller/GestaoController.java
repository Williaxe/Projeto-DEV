package br.com.letscode.demo.controller;

import br.com.letscode.demo.domain.Agencia;
import br.com.letscode.demo.domain.Endereco;
import br.com.letscode.demo.domain.Gestao;
import br.com.letscode.demo.service.AgenciaService;
import br.com.letscode.demo.service.GestaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gestao")

public class GestaoController {

    private GestaoService gestaoService;

    public GestaoController (GestaoService gestaoService){
        this.gestaoService = gestaoService;
    }

    @GetMapping()
    public List<Gestao> listaGestao() {
        return gestaoService.list();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletaGestao(@PathVariable(value = "id")Integer id){
        gestaoService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public Gestao adicionaGestao(@RequestBody Gestao gestao){
        return gestaoService.save(gestao);
    }

}
