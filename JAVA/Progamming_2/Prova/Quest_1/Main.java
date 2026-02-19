package Progamming_2.Prova.Quest_1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        ArrayList<Veiculos> veiculos = new ArrayList<>();

        Veiculos carro = new Carro("Toyota ", "Corolla", 2022, 177);
        Veiculos moto = new Moto("Honda ", "CG 160", 2021);

        veiculos.add(carro);
        veiculos.add(moto);

        for(Veiculos v: veiculos){
            v.exibirInformacoes();
        }
    }
}
