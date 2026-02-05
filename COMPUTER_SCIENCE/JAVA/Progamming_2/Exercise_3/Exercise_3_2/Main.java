package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_3.Exercise_3_2;

import java.util.ArrayList;

public class Main {
    public static void processarPagamento(MetodoPagamento Metodo, double valor){
        boolean autorizado = Metodo.autorizar(valor);

        if (autorizado) {
            System.out.println("Pagamento processado com sucesso.\n");
        } else {
            System.out.println("Falha no processamento do pagamento.\n");
        }
    }
    public static void main(String[] args){
        ArrayList<MetodoPagamento> pag = new ArrayList<>();

        pag.add(new Pix());
        pag.add(new Boleto());
        pag.add(new CartaoCredito());

        for(MetodoPagamento m : pag){
            double valor = Math.random() * 2000;
            processarPagamento(m, valor);
        }
    }
}
