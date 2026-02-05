package COMPUTER_SCIENCE.JAVA.Progamming_2.Prova.Quest_1;

public abstract class Veiculos {
    protected String marca; 
    protected String modelo;
    protected int ano;

    public Veiculos(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract void exibirInformacoes();
}
