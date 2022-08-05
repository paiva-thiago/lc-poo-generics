package br.com.letscode.exercicio.locadora;

import br.com.letscode.exercicio.locadora.exceptions.LocadoraException;
import br.com.letscode.exercicio.locadora.itens.Veiculo;

public class Gerenciador implements Locadora {

    @Override
    public <T extends Veiculo> void obterVeiculo(T v){
        try{
            if(v.estaDisponivel()){
                v.agoraAlugado();
                System.out.println("AVISO:  ".concat(v.getNome()).concat(" ALUGADO!"));
            }else{
                throw new LocadoraException(v);
            }
        }catch(LocadoraException l){
            System.err.println(l.getMessage());
        }
        
    }

    @Override
    public <T extends Veiculo> void devolverVeiculo(T v) {
        try{

            if(v.estaAlugado()){
                v.agoraDevolvido();
                System.out.println("AVISO: ".concat(v.getNome()).concat(" DEVOLVIDO!"));
            }else{
                throw new LocadoraException(v);
            }
        }catch(LocadoraException l){
            System.err.println(l.getMessage());
        }    
    }

    public <T extends Veiculo> void oficina(T v){
        v.emManutencao();
    }
}
