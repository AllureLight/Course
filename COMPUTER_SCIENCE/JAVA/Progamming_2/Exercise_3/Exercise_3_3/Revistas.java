package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_3.Exercise_3_3;

public class Revistas implements Consultavel{
    @Override
    public void abrir() { System.out.println("Abrindo revista..."); }
    public boolean buscar(String palavra) { return false; }
    public int numerosPaginas() { return 40; }
}