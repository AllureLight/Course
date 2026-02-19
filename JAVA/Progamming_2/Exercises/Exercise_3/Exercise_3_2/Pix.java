package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_3.Exercise_3_2;

public class Pix implements MetodoPagamento{
    @Override
    public boolean autorizar(double valor) {
        System.out.println("Pagamento autorizado via Pix: R$ " + valor);
        return true;
    }
}
