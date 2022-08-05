package br.com.letscode.exercicio.locadora.enums;

public enum EstadoVeiculoEnum {
    DISPONIVEL(0,"DISPONIVEL"),
    INDISPONIVEL(1,"ALUGADO"),
    MANUTENCAO(-1,"MANUTENCAO - NA OFICINA");
    private int situacao;
    private String descricao;
    EstadoVeiculoEnum(int status, String descricao){
        this.situacao=status;
        this.descricao=descricao;
    }
    public int code(){
        return situacao;
    }
    public String status(){
        return descricao;
    }
}
