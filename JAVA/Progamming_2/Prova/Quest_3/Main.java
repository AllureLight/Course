package COMPUTER_SCIENCE.JAVA.Progamming_2.Prova.Quest_3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        ArrayList<Livro> l = new ArrayList<>();

        l.add(new Livro("A", "Teste 1", 1980));
        l.add(new Livro("B", "Teste 2", 2010));
        l.add(new Livro("C", "Teste 3", 1994));

        Collections.sort(l);

        for (Livro livros : l) {
            System.out.println(livros);
        }
    }
}
