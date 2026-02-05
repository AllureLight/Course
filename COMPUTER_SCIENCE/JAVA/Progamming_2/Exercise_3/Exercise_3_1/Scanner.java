package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_3.Exercise_3_1;

public class Scanner implements Conectavel{
    @Override
    public void conectar(){
        System.out.println("Scanner conectada.");
    }
    @Override
    public void desconectar(){
        System.out.println("Scanner desconectar.");
    }
}
