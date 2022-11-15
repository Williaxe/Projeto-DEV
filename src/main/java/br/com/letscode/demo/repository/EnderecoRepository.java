package br.com.letscode.demo.repository;

import br.com.letscode.demo.domain.Agencia;
import br.com.letscode.demo.domain.DCM;
import br.com.letscode.demo.domain.Endereco;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface EnderecoRepository extends CrudRepository<Endereco, Long> {

    }


