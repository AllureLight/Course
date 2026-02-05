package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_2.Challenge;

public class Comissionado extends Funcionario{
    public Comissionado(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public double calcularPagamento(){
        return salarioBase * 1.10;
    }
}
