package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_1;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return this.titular;
    }

    public void depositar (double valor) {
        if (valor > 0) {
            setSaldo(this.saldo + valor);
        }
    }

    public void sacar (double valor) {
        if (valor > 0 && valor <= saldo) {
            setSaldo(this.saldo - valor);
        }
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Joao", 1000);

        conta.depositar(500);
        conta.sacar(300);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
