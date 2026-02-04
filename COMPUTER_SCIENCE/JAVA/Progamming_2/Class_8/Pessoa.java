package COMPUTER_SCIENCE.JAVA.Progamming_2.Class_8;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String toString() {
        return "Pessoa{nome='" + nome + "', idade=" + idade + "}";
    }
}