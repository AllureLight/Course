package COMPUTER_SCIENCE.JAVA.Progamming_2.Prova.Quest_1;

public class Moto extends Veiculos{
    public Moto(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    @Override
    public void exibirInformacoes(){
        System.out.println(marca + modelo + ano);
    }
}
