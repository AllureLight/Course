package COMPUTER_SCIENCE.JAVA.Progamming_2.Exemplo2_Interface;

public class EmailNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação por email: " + mensagem);
    }
    
}
