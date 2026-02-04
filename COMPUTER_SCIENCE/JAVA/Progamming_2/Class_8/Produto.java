package COMPUTER_SCIENCE.JAVA.Progamming_2.Class_8;

public class Produto<T, G> {
    private T codigo;
    private String descricao;
    private G preco;

    public  Produto(T codigo, String descricao, G preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public T getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public G getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }

    public static void main(String[] args) {
        Produto<String, Double> p1 = new Produto<>("A123", "Notebook", 2500.00);
        Produto<Integer, Integer> p2 = new Produto<>(456, "Mouse", 75);
        Produto<Double, Integer> p3 = new Produto<>(789.01, "Teclado", 150);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
