package COMPUTER_SCIENCE.JAVA.Progamming_2.Training.Training_3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("A", 123, 7.6));
        alunos.add(new Aluno("B", 456, 5.6));
        alunos.add(new Aluno("C", 789, 8.6));

        Collections.sort(alunos);

        for(Aluno al : alunos){
            System.out.println(al);
        }
    }
}
