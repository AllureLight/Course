package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_4;

import java.util.ArrayList;

public class TestaSom{

    public static void main(String[] args){
        ArrayList<AparelhoSonoro> ap = new ArrayList<>();

        ap.add(new Radio());
        ap.add(new TocaFitas());

        for(AparelhoSonoro aparelho : ap){
            aparelho.som();
        }
    }
}
