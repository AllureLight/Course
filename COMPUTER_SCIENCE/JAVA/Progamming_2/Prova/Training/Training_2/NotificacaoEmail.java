package COMPUTER_SCIENCE.JAVA.Progamming_2.Prova.Training.Training_2;

public class NotificacaoEmail implements Notificacao{
    @Override
    public void enviar(String mensagem){
        System.out.println("Email " + mensagem);
    }
}
