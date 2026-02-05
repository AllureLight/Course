package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_2.Challenge;

public class Horista extends Funcionario{
    private int horas;
    private double valorhora;

    public Horista(String nome, int horas, double valorhora){
        super(nome, 0);
        this.horas = horas;
        this.valorhora = valorhora;
    }

    @Override
    public double calcularPagamento(){
        return horas * valorhora;
    }
}
