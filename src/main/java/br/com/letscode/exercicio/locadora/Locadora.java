package br.com.letscode.exercicio.locadora;

import br.com.letscode.exercicio.locadora.itens.Veiculo;

public interface Locadora   {
    public <T extends Veiculo> void  obterVeiculo(T v) ;
    public <T extends Veiculo> void  devolverVeiculo(T v);
    public <T extends Veiculo> void oficina(T v);
}
