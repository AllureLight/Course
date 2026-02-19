package COMPUTER_SCIENCE.JAVA.Progamming_2.Prova.Quest_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Pagamento> pag = new ArrayList<>();

        for(int i = 0; i < 30; i++){
            pag.add(new PagamentoCartao());
        }

        for(int i = 0; i < 30; i++){
            pag.add(new PagamentoBoleto());
        }

        for(Pagamento p : pag){
            double valor = Math.random() * 1000.00;
            p.realizarPagamento(valor);
        }
    }
}
