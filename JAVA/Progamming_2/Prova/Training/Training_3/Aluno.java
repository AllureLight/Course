package COMPUTER_SCIENCE.JAVA.Progamming_2.Prova.Training.Training_3;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private int matricula;
    private double notaFinal;

    public Aluno(String nome, int matricula, double notaFinal){
        this.nome = nome;
        this.matricula = matricula;
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return ("Nome: " + nome + ", Matricula: " + matricula + ", notaFinal: " + notaFinal);
    }

    @Override
    public int compareTo(Aluno al){
        return Double.compare(this.notaFinal, al.notaFinal);
    }
}
