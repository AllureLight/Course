package COMPUTER_SCIENCE.JAVA.Progamming_2.Prova.Quest_2;

public class PagamentoCartao implements Pagamento{
    @Override
    public void realizarPagamento(double valor){
        System.out.println("Pagamento no Cartao de " + valor);
    }
}
