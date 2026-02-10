package COMPUTER_SCIENCE.JAVA.Progamming_2.Prova.Training.Training_1;

public abstract class Funcionario {
    protected String nome;
    protected int id;

    public Funcionario(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public abstract void exibirInformacoes();
}
