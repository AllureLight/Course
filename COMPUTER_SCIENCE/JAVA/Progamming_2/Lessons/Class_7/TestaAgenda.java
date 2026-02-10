package COMPUTER_SCIENCE.JAVA.Progamming_2.Lessons.Class_7;

public class TestaAgenda {
    public static void main(String[] args) {
        Agenda a = new Agenda();

        Contato c1 = new Contato("bob", "1234-5678");
        Contato c2 = new Contato("alice", "9876-5432");

        a.inserirContato(c1);
        a.inserirContato(c2);
        a.inserirContato(new Contato("Bruno","12345"));
        a.inserirContato(new Contato("Ana","54321"));

        System.out.println(a);

        a.removerContato("Ana");

        //System.out.println("\n" + a);

        Contato busca = a.pesquisarContato("Bruno");
        if (busca != null) {
            System.out.println("\nContato encontrado: " + busca.getNome() + " - " + busca.getTelefone());
        } else {
            System.out.println("\nContato não encontrado.");
        }

        busca = a.pesquisarContato("Ana");
        if (busca != null) {
            System.out.println("\nContato encontrado: " + busca.getNome() + " - " + busca.getTelefone());
        } else {
            System.out.println("\nContato não encontrado.");
        }
    }
}
