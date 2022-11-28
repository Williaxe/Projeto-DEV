package br.com.letscode.demo.Exception;

public class EquipamentoNaoLocalizado extends RuntimeException {
    public EquipamentoNaoLocalizado(){
        super("Equipamento não Localizado");
    }

}
