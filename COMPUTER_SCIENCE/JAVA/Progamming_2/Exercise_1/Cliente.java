package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_1;

public class Cliente {
    private String nome;
    private Endereco endereco;

    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joao", new Endereco("Rua A", "Cidade X"));
        System.out.println("Nome do cliente: " + cliente.nome);
        System.out.println("Endereço do cliente: " + cliente.endereco.getRua() + ", " + cliente.endereco.getCidade());
    }
}
