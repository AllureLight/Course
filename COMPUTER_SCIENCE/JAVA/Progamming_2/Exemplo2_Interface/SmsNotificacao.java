package COMPUTER_SCIENCE.JAVA.Progamming_2.Exemplo2_Interface;

public class SmsNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
    }
}
