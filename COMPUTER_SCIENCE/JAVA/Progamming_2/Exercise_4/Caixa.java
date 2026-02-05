package COMPUTER_SCIENCE.JAVA.Progamming_2.Exercise_4;

public class Caixa<T> {

    private T objeto;

    public void guardar(T obj){
        this.objeto = obj;
    }

    public T pegar(){
        return objeto;
    }
}
