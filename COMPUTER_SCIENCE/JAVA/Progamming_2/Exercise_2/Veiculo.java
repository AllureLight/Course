package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_2;

public abstract class Veiculo {
    protected String marca;
    protected int ano;

    public abstract void acelerar();

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }


}
