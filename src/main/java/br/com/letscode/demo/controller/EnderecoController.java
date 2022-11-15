package br.com.letscode.demo.controller;

import br.com.letscode.demo.domain.Endereco;
import br.com.letscode.demo.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/enderecos")

public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> getEndereco() {
        return enderecoService.getAllEndereco();

    }
}
