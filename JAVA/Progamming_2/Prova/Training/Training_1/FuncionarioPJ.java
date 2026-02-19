package COMPUTER_SCIENCE.JAVA.Progamming_2.Prova.Training.Training_1;

public class FuncionarioPJ extends Funcionario{
    private double valorHora;

    public FuncionarioPJ(String nome, int id, double valorHora){
        super(nome, id);
        this.valorHora = valorHora;
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Nome: " + nome + ", Id: " + id + ", Valor Hora: " + valorHora);
    }
}
