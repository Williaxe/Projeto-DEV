package br.com.letscode.demo.controller;

import br.com.letscode.demo.domain_old.Endereco;
import br.com.letscode.demo.service_old.EnderecoService;
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
