package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercises.Exercise_2;

public class Animal {
    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }

    public void main(String[] args) {
        Animal meuAnimal = new Animal();
        meuAnimal.emitirSom();

        Animal meuGato = new Gato();
        meuGato.emitirSom();

        Animal meuHumano = new Humano();
        meuHumano.emitirSom();
    }
}
