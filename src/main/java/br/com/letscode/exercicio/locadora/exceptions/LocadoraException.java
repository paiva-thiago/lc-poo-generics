package br.com.letscode.exercicio.locadora.exceptions;

import br.com.letscode.exercicio.locadora.itens.Veiculo;

public class LocadoraException extends  Exception{
    public LocadoraException(String msg){
        super(msg);
    }
    public LocadoraException(Veiculo v){
        super("[ERROR] ".concat(v.getStatus()));
    }
}
