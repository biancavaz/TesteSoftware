package org.example.Integracao;

import java.util.ArrayList;
import java.util.List;

// QUESTÃO 10
public class MessageService {

    private List<String> sentMessages = new ArrayList<>();

    public boolean sendMessages(String to, String subject, String body) {
        if (to == null || subject == null || body == null || to.isEmpty()) {
            return false; // simula falha no envio se os parametros forem inválidos
        }

        String Mensagem = "\npara:" +to+ "\nAssunto:" + subject + "\nCorpo:" +body;
        sentMessages.add(Mensagem);
        System.out.println("MENSAGEM ENVIADA" + Mensagem);
        return true;
    }

    //retorna todos as mensagens enviadas
    public List<String> getSentMessages() {
        return sentMessages;
    }
}
