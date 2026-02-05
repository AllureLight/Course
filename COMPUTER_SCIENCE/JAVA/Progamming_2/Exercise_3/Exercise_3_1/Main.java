package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_3.Exercise_3_1;

public class Main {
    public static void main(String[] args){
        Conectavel[] dispo = {new Impressora(), new Scanner(), new Webcam()};

        for(Conectavel d : dispo){
            d.conectar();
            d.desconectar();
        }
    }
}
