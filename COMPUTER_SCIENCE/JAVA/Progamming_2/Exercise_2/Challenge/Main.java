package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_2.Challenge;

public class Main {
    public static void main(String[] args){
        Funcionario[] funcionarios = new Funcionario[3];

        funcionarios[0] = new Assalariado("A", 3000);
        funcionarios[1] = new Comissionado("B", 3000);
        funcionarios[2] = new Horista("C", 160, 25);

        for (Funcionario f : funcionarios) {
            System.out.println(
                f.nome + " recebe: R$ " + f.calcularPagamento()
            );
        }
    }
}
