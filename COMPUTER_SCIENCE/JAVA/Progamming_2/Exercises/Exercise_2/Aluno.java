package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_2;

public class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matrícula: " + getMatricula());
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Joao", 20, "2023001");
        aluno.exibirDados();
    }
}
