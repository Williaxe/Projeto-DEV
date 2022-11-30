package br.com.letscode.demo.config;


import br.com.letscode.demo.Exception.EquipamentoNaoConstaNaJuncao;
import br.com.letscode.demo.Exception.EquipamentoNaoLocalizado;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerException {


        @ExceptionHandler({EquipamentoNaoLocalizado.class})
        @ResponseStatus(HttpStatus.NOT_FOUND)
        public APIErro handlerExceptionEquipamentoNaoLocalizado (Exception exception){
            APIErro apiErro = APIErro.builder()
                    .message(exception.getMessage())
                    .code("ERRO001")
                    .build();
            return apiErro;
        }

    @ExceptionHandler({EquipamentoNaoConstaNaJuncao.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public APIErro handlerExceptionEquipamentoNaoConstanaJuncao (Exception exception){
        APIErro apiErro = APIErro.builder()
                .message(exception.getMessage())
                .code("ERRO002")
                .build();
        return apiErro;
    }

    }
