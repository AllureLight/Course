package COMPUTER_SCIENCE.JAVA.Progamming_2.Lessons.Extra_Comparacoes_Java;

import java.util.ArrayList;
import java.util.Collections;

public class TesteComparacoesContato {
    public static void main(String[] args) {
        Contato c1 = new Contato("Alice", 30);
        Contato c2 = new Contato("Charlie", 25);
        Contato c3 = new Contato("Bob", 35);

        ArrayList<Contato> contatos = new ArrayList<>();
        contatos.add(c1);
        contatos.add(c2);
        contatos.add(c3);

        System.out.println("Impressao antes da ordenacao:");
        for(Contato c : contatos){
            System.out.println(c.getName() + " - " + c.getAge());
        }

        //Usando isso no Colletions, ele ordena por nome, pois eh o que o compareTo faz
        ComparadorContatoNome cn = new ComparadorContatoNome();

        //Organizando a lista com Collections.sort()
        Collections.sort(contatos, cn);

        System.out.println("Impressao depois da ordenacao:");
        for(Contato c : contatos){
            System.out.println(c.getName() + " - " + c.getAge());
        }
    }
}
