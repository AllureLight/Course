package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_4;

public class TestaCaixa {
    public static void main(String[] args){
        Caixa<String> caixaString = new Caixa<>();
        caixaString.guardar("Programação Genérica");
        System.out.println("Conteúdo da caixa de String: " + caixaString.pegar());

        Caixa<Integer> caixaInteger = new Caixa<>();
        caixaInteger.guardar(42);
        System.out.println("Conteúdo da caixa de Integer: " + caixaInteger.pegar());
    }
}
