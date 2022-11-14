package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.DCM;

import java.util.List;

public interface DCMService {



    DCM save(DCM dcm);


    DCM getById(Integer id);


    DCM update(Integer id, DCM dcm);

    void delete(Integer id);
}
