package COMPUTER_SCIENCE.JAVA.Progamming_2.Lessons.Extra_Comparacoes_Java;

import java.util.Comparator;

public class ComparadorContatoNome implements Comparator<Contato>{
    @Override
    public int compare(Contato c1, Contato c2) {
        return c1.getName().compareTo(c2.getName());
    }
}
