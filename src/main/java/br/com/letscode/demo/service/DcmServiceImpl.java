package br.com.letscode.demo.service;

import br.com.letscode.demo.domain.DCM;
import br.com.letscode.demo.repository.DCMRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class DcmServiceImpl implements DCMService {

    @Autowired

    private DCMRepository dcmRepository;



    @Override
    public DCM save(DCM dcm) {

        return dcmRepository.save(dcm);
    }
    @Override
    public DCM getById(Integer id) {

        return dcmRepository.findById(id).get();
    }

    @Override
    public DCM update(Integer id, DCM dcm) {
        dcm.setIdDcm(id);
        return dcmRepository.save(dcm);
    }

    @Override
    public void delete(Integer id) {

        dcmRepository.deleteById(id);
    }
}




