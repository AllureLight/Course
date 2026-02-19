package COMPUTER_SCIENCE.JAVA.Progamming_2.Lessons.Class_8;

public class DadoGenerica<E> {
    private E dado;

    public DadoGenerica(E dado) {
        this.dado = dado;
    }

    public E getDado() {
        return dado;
    }

    public static void main(String[] args) {
        DadoGenerica<String> d = new DadoGenerica<>("exemplo");
        String x = d.getDado();
        System.out.println("Dado: " + x);

        DadoGenerica<Pessoa> d2 = new DadoGenerica<>(new Pessoa("João", 30));
        Pessoa p = d2.getDado();
        System.out.println(p);
    }
}
