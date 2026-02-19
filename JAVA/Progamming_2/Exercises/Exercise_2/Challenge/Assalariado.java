package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_2.Challenge;

public class Assalariado extends Funcionario{
    public Assalariado(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularPagamento(){
        return salarioBase;
    }
}
