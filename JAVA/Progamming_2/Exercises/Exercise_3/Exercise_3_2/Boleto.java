package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_3.Exercise_3_2;

public class Boleto implements MetodoPagamento {

    @Override
    public boolean autorizar(double valor) {
        if (valor >= 50) {
            System.out.println("Pagamento autorizado via Boleto: R$ " + valor);
            return true;
        }
        System.out.println("Valor muito baixo para Boleto.");
        return false;
    }
}