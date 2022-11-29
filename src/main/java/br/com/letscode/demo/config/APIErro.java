package br.com.letscode.demo.config;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
@Getter
@Setter


public class APIErro {

    private String message;
    private String code;
    private List<FieldErrorDTO> error;



}
