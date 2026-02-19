package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_2;

public class Carro extends Veiculo{

    public Carro(String marca, int ano) {
        super(marca, ano);
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
}
