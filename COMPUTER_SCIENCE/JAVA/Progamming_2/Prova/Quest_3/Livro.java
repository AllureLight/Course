package COMPUTER_SCIENCE.JAVA.Progamming_2.Prova.Quest_3;

public class Livro implements Comparable<Livro>{
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString(){
        return ("Titulo: " + titulo + ", Autor: " + autor + ", Ano de Publicacao: " + anoPublicacao);
    }

    @Override
    public int compareTo(Livro livro){
        return anoPublicacao - livro.anoPublicacao;
    }
}
