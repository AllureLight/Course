package Progamming_2.Prova.Quest_2;

public class PagamentoBoleto implements Pagamento{
    @Override
    public void realizarPagamento(double valor){
        System.out.println("Pagamento no Boleto de " + valor);
    }
}
