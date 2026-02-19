package Progamming_2.Lessons.Class_7;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void inserirContato(Contato contato) {
        contatos.add(contato);
    }

    public boolean removerContato(String nome) {
        Contato localizado = pesquisarContato(nome);
        if (localizado != null) {
            contatos.remove(localizado);
            return true;
        } else {
            return false;
        }
    }

    public Contato pesquisarContato(String nome) {
        Contato localizado = null;
        for (Contato c : contatos) {
            if(c.getNome().equals(nome)){
                localizado = c;
                break;
            }
        }
        return localizado;
    }

    public boolean alterarTelefoneContato(String nome, String novoTelefone) {
        Contato localizado = pesquisarContato(nome);
        if (localizado != null) {
            contatos.remove(localizado);
            return true;
        }
        return false;
    }

    //Usado para testar os valores do seu objeto (toString)
    //Ja existe uma versao default do toString na classe Object
    //Esse override substitui a versao default
    //Assim, quando voce tentar imprimir um objeto da classe Agenda
    //o Java vai usar esse metodo para gerar a String que representa o objeto
    @Override
    public String toString() {
        String temp = "Contatos: ";
        int i = 0;
        for (Contato c : contatos) {
            i++;
            temp += "\n" + i + " - " + c.getNome() + " - " + c.getTelefone();
        }
        return temp;
    }
}