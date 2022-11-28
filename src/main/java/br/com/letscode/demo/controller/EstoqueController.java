package br.com.letscode.demo.controller;

import br.com.letscode.demo.domain.Endereco;
import br.com.letscode.demo.domain.Estoque;
import br.com.letscode.demo.service.EstoqueService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estoques")

public class EstoqueController {

    private EstoqueService estoqueService;

    public EstoqueController(EstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }

    @GetMapping("/{nome}/{idJuncao}")
    public Endereco buscaEndereco(@PathVariable(value = "nome")String nome,
                                  @PathVariable(value = "idJuncao") Integer idJuncao) throws Exception {
        return estoqueService.buscaEndereco(nome, idJuncao);
    }

    @DeleteMapping("/{idJuncao}")
    public ResponseEntity<Object> deletaEstoque(@PathVariable(value = "idJuncao")Integer idJuncao){
        estoqueService.delete(idJuncao);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public Estoque adicionaEstoque(@RequestBody Estoque estoque) {
        return estoqueService.save(estoque);
    }

    @PatchMapping("/{idJuncao}")
    public Estoque alterarEstoque(@PathVariable(value = "idJuncao")Integer idJuncao,
                                  @RequestBody Estoque estoque){
        return estoqueService.update(idJuncao, estoque);
    }
}

