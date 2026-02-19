package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_3.Exercise_3_3;

public class Livros implements Consultavel{
    @Override
    public void abrir() { 
        System.out.println("Abrindo livro..."); 
    }
    public boolean buscar(String palavra) {
        return true; 
    }
    public int numerosPaginas() { 
        return 350; 
    }
}