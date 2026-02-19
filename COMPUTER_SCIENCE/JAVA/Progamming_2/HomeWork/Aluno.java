package COMPUTER_SCIENCE.JAVA.Progamming_2.HomeWork;

//Classe de Aluno
public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) throws NotaInvalidaException {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia(){
        return (nota1 + nota2) / 2.0;
    }

    public String verificarSituacao(){
        double media = calcularMedia();

        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + 
               " | Nota 1: " + nota1 +
               " | Nota 2: " + nota2 +
               " | Média: " + String.format("%.2f", calcularMedia()) +
               " | Situação: " + verificarSituacao();

    }
}
