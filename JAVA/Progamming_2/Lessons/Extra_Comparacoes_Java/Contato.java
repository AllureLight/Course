package Progamming_2.Lessons.Extra_Comparacoes_Java;

public class Contato implements Comparable<Contato> {
    private String name;
    private int age;

    public Contato(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Contato outroContato) {
        return age - outroContato.age;
    }
}
