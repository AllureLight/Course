package Progamming_2.Lessons.Exemplo2_Interface;

public class EmailNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando notificação por email: " + mensagem);
    }
    
}
