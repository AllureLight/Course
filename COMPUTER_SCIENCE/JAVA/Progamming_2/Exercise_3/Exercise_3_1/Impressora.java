package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_3.Exercise_3_1;

public class Impressora implements Conectavel{
    @Override
    public void conectar(){
        System.out.println("Impressora conectada.");
    }
    @Override
    public void desconectar(){
        System.out.println("Impressora desconectar.");
    }
}
