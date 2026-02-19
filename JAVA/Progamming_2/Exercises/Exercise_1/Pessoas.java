package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_1;

public class Pessoas {
    private String nome;
    private int idade;

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static void main(String[] args) {
        Pessoas p = new Pessoas();
        p.setNome("Ana");
        p.setIdade(25);
        p.exibirDados();
    }
}
