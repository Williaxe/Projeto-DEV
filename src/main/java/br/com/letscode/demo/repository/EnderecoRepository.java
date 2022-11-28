package br.com.letscode.demo.repository;

import br.com.letscode.demo.domain.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<Endereco, Long> {

    }


