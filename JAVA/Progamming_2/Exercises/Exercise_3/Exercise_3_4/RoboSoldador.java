package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_3.Exercise_3_4;

public class RoboSoldador implements Movimentavel, Operavel{
    @Override
    public void moverPara(double x, double y){
        System.out.println("O Soldador moveu para " + x*y);
    }

    @Override
    public void executarOperacao(String nome){
        System.out.println("O Soldador executou " + nome);
    }
}
