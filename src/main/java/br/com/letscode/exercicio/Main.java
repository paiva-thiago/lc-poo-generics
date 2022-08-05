package br.com.letscode.exercicio;

import java.util.ArrayList;
import java.util.List;

import br.com.letscode.exercicio.locadora.Gerenciador;
import br.com.letscode.exercicio.locadora.Locadora;
import br.com.letscode.exercicio.locadora.itens.Bike;
import br.com.letscode.exercicio.locadora.itens.Carro;
import br.com.letscode.exercicio.locadora.itens.Moto;
import br.com.letscode.exercicio.locadora.itens.Veiculo;

public class Main {
    private static List<Veiculo> veiculos;

    private static void initList(){
        veiculos=new ArrayList<>();
        veiculos.add(new Carro("Uno Escadinha"));
        veiculos.add(new Moto("TENERE"));
        veiculos.add(new Bike("Caloi"));
        veiculos.add(new Carro("Corsa"));
        veiculos.add(new Carro("Monarque"));
    }
    private static void listStatus(){
        System.out.println("---------- STATUS DO ESTOQUE ---------- ");
        for(Veiculo v:veiculos){
            System.out.println(v.getStatus());
        }
    }
    public static void main(String[] args) throws Exception{
        initList();
        int ctrl=0;
        Locadora loca = new Gerenciador();
        for(Veiculo v:veiculos){
            loca.obterVeiculo(v);
        }
        for(Veiculo v:veiculos){
            ctrl++;
            if(ctrl%2==0){
                loca.obterVeiculo(v);
            }else if(ctrl%3==0){
                loca.oficina(v);
            }else{
                loca.devolverVeiculo(v);
            }
        }
       listStatus();
    } 
}
