package COMPUTER_SCIENCE.JAVA.Progamming_2.Lessons.Exemplo2_Interface;

public class PushNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando Push Notification: " + mensagem);
    }
}
