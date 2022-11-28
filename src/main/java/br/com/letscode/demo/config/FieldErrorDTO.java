package br.com.letscode.demo.config;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder

public class FieldErrorDTO {

    private String name;
    private String error;
}
