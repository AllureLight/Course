package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_3.Exercise_3_4;

public class RodoTransportador implements Movimentavel{
    @Override
    public void moverPara(double x, double y){
        System.out.println("O Transportador moveu para " + x*y);
    }
}
