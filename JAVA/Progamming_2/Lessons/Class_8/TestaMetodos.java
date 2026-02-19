package Progamming_2.Lessons.Class_8;

public class TestaMetodos {
    public static void imprimeArray(String[] meuArray) {
        for (String elemento: meuArray) {
            System.out.println(elemento);
        }
    }

    public static void imprimeArray(Double[] meuArray) {
        for (Double elemento: meuArray) {
            System.out.println(elemento);
        }
    }

    public static void imprimeArray( Character[] meuArray) {
        for (Character elemento: meuArray) {
            System.out.println(elemento);
        }
    }

    public static <T> void printArray(T[] meuArray) {
        for (T elemento: meuArray) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        String[] nomes = {"Ana", "Carlos", "Beatriz"};
        Double[] precos = {10.5, 20.0, 15.75};
        Character[] letras = {'A', 'B', 'C'};

        //Pra nn ter que criar varios imprimeArray
        //Todos com sobrecarga
        //É possivel realizar esse procedimento com Generics
        //imprimeArray(nomes);
        //imprimeArray(precos);
        //imprimeArray(letras);

        printArray(nomes);
        printArray(precos);
        printArray(letras);
    }
}