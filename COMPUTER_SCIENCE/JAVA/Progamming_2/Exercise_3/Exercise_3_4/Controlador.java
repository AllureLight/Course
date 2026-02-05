package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_3.Exercise_3_4;

import java.util.List;

public class Controlador {
    public static void controlarMovimento(List<Movimentavel> moviveis){
        for (Movimentavel m : moviveis) {
            m.moverPara(10, 20);
        }
    }

    public static void controlarOperacoes(List<Operavel> operaveis) {
        for (Operavel o : operaveis) {
            o.executarOperacao("Operacao Padrao");
        }
    }
}
