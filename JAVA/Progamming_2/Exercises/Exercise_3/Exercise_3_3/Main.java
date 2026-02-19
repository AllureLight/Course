package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_3.Exercise_3_3;

public class Main {
    public static void main(Consultavel[] con){
        for(Consultavel c : con){
            c.abrir();
            System.out.println("Páginas: " + c.numerosPaginas());
        }
    }
}
