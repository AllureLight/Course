package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_3.Exercise_3_3;

public class PDF implements Consultavel{
    @Override
    public void abrir() { System.out.println("Abrindo PDF..."); }
    public boolean buscar(String palavra) { return true; }
    public int numerosPaginas() { return 20; }
}
