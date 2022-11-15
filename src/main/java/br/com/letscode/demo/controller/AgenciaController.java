package br.com.letscode.demo.controller;

import br.com.letscode.demo.domain.Agencia;
import br.com.letscode.demo.domain.Endereco;
import br.com.letscode.demo.service.AgenciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agencias")

public class AgenciaController {
    private AgenciaService agenciaService;

    public AgenciaController (AgenciaService agenciaService){
        this.agenciaService = agenciaService;
    }

    @GetMapping("/{nome}/{idJuncao}")
    public Endereco buscaEndereco(@PathVariable(value = "nome")String nome,
                                  @PathVariable(value = "idJuncao") Integer idJuncao) throws Exception {
        return agenciaService.buscaEndereco(nome, idJuncao);
    }

    @DeleteMapping("/{idJuncao}")
    public ResponseEntity<Object> deletaAgencia(@PathVariable(value = "idJuncao")Integer idJuncao){
        agenciaService.delete(idJuncao);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public Agencia adicionaAgencia(@RequestBody Agencia agencia){
        return agenciaService.save(agencia);
    }

    @PatchMapping("/{idJuncao}")
    public Agencia alterarAgencia(@PathVariable(value = "idJuncao")Integer idJuncao,
                                  @RequestBody Agencia agencia){
        return agenciaService.update(idJuncao, agencia);
    }

}
