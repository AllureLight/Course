package Progamming_2.Prova.Quest_1;

public class Carro extends Veiculos{
    private double potenciaMotor;

    public Carro(String marca, String modelo, int ano, double potenciaMotor){
        super(marca, modelo, ano);
        this.potenciaMotor = potenciaMotor;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println(marca + modelo + ano + potenciaMotor);
    }
}
