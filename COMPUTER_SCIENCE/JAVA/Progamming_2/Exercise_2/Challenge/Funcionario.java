package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_2.Challenge;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularPagamento();
}
