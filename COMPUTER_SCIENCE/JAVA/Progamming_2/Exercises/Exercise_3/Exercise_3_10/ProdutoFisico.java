package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_3.Exercise_3_10;

public class ProdutoFisico implements Descontavel{
    @Override
    public double getPreco(){
        return 20;
    }
    
    @Override
    public double getPrecoComDesconto(){
        return 10;
    }
}
