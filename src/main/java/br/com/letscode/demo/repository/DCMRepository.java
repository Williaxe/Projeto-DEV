package br.com.letscode.demo.repository;

import br.com.letscode.demo.domain.Agencia;
import br.com.letscode.demo.domain.DCM;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DCMRepository extends CrudRepository<DCM, Integer> {
}


