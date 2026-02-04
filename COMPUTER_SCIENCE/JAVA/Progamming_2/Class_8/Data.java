package COMPUTER_SCIENCE.JAVA.Progamming_2.Class_8;

public class Data {
    private String data;

    public Data(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public static void main(String[] args) {
        Data today = new Data("2024-06-15");
        String x = today.getData();
        System.out.println("Today's data is: " + x);

        //Data today2 = new Data("1234");
    }
}
