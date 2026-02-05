package COMPUTER_SCIENCE.JAVA.Progamming_2.Training.Training_1;

public class FuncionarioCLT extends Funcionario{
    private double salarioMensal;

    public FuncionarioCLT(String nome, int id, double salarioMensal){
        super(nome, id);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome + ", Id: " + id + ", Salario Mensal: " + salarioMensal);
    }
}