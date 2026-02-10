package COMPUTER_SCIENCE.JAVA.Progamming_2.Prova.Training.Training_1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Funcionario> fun = new ArrayList<>();

        fun.add(new FuncionarioCLT("Fern", 123, 890));
        fun.add(new FuncionarioPJ("Aber", 456, 78));

        for(Funcionario f : fun){
            f.exibirInformacoes();
        }
    }
}
