package br.com.letscode.demo.Exception;

public class EquipamentoNaoConstaNaJuncao extends RuntimeException{
    public EquipamentoNaoConstaNaJuncao(){
        super("Equipamento não consta na Junção Remetente");
    }

}
