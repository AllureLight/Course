package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_2;

public class Moto extends Veiculo {

    public Moto(String marca, int ano) {
        super(marca, ano);
    }
    
    @Override
    public void acelerar() {
        System.out.println("A moto está acelerando!");
    }
    
}
