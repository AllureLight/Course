package COMPUTER_SCIENCE.JAVA.Progamming_2.Prova.Training.Training_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Notificacao> noti = new ArrayList<>();

        for(int i = 0; i < 20; i++){
            noti.add(new NotificacaoSms());
        }

        for(int i = 0; i < 20; i++){
            noti.add(new NotificacaoEmail());
        }

        for(Notificacao n : noti){
            n.enviar("Mensagem " + (int)(Math.random() * 100));
        }
    }
}
