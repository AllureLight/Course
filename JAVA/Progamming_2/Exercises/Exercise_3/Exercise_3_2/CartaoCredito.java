package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_3.Exercise_3_2;

public class CartaoCredito implements MetodoPagamento{
    @Override
    public boolean autorizar(double valor) {
        if (valor <= 1000) {
            System.out.println("Pagamento autorizado no Cartão de Crédito: R$ " + valor);
            return true;
        }
        System.out.println("Pagamento recusado no Cartão de Crédito.");
        return false;
    }
}
