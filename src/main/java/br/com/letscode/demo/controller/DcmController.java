package br.com.letscode.demo.controller;


import br.com.letscode.demo.domain.DCM;
import br.com.letscode.demo.dto.DCMDto;
import br.com.letscode.demo.service.DCMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dcms")

public class DcmController {
    @Autowired
    private DCMService dcmService;

    @GetMapping("/{idDcm}/{juncaoRemetente}/{juncaoDestinatario}")
    public ResponseEntity<Object> getDCMById(@PathVariable(value = "idDcm")Integer idDcm ,
                                             @PathVariable(value = "juncaoRemetente") String idJuncaoRemetente,
                                             @PathVariable(value = "juncaoDestinatario") String idJuncaoDestinatario)
    { return ResponseEntity.status(HttpStatus.OK).body(dcmService);
    }

    @PostMapping

    public DCM adicionarDcm(@RequestBody DCMDto dto) throws Exception {
        return dcmService.save(dto);
    }



    }
