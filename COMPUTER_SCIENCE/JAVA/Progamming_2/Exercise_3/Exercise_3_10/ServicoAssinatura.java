package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_3.Exercise_3_10;

public class ServicoAssinatura implements ItemVenda{
    private double mensalidade;
    private double taxaServico;

    @Override 
    public double getPreco(){
        return mensalidade + taxaServico;
    }
}
