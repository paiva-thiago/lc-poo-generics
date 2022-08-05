package br.com.letscode.exercicio.locadora.itens;

import br.com.letscode.exercicio.locadora.enums.EstadoVeiculoEnum;

public abstract class Veiculo {
    
    private EstadoVeiculoEnum disponibilidade;
    private String nome;
    private Veiculo(EstadoVeiculoEnum e){
        this.disponibilidade=e;
    }

    public Veiculo(){
        this(EstadoVeiculoEnum.DISPONIVEL);
    }
    
    public Veiculo(String str){
        this();
        this.nome=str;
    }
    
    public boolean estaDisponivel(){
        return disponibilidade==EstadoVeiculoEnum.DISPONIVEL;
    }
    
    public boolean estaAlugado(){
        return disponibilidade==EstadoVeiculoEnum.INDISPONIVEL;
    }

    public boolean emManutencao(){
        return disponibilidade==EstadoVeiculoEnum.MANUTENCAO;
    }
    
    public void agoraAlugado(){
        this.disponibilidade=EstadoVeiculoEnum.INDISPONIVEL;
    }

    public void agoraDevolvido(){
        this.disponibilidade=EstadoVeiculoEnum.DISPONIVEL;
    }

    public String getNome(){
        if(nome==null){
            return "";
        }
        return nome;
    }

    public String getStatus(){
        return "O veiculo ".concat(this.nome).concat(" esta ").concat(this.disponibilidade.status());
    }
}
