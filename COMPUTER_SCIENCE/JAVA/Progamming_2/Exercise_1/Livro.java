package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_1;

public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", "George Orwell");
        Livro livro2 = new Livro("To Kill a Mockingbird", "Harper Lee");

        System.out.println("Livro 1: " + livro1.titulo + " by " + livro1.autor);
        System.out.println("Livro 2: " + livro2.titulo + " by " + livro2.autor);
    }
}
