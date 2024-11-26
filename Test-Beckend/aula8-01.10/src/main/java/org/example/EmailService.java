package org.example;

import java.util.ArrayList;
import java.util.List;

public class EmailService {

    private List<String> sentEmails = new ArrayList<>();

    //simula o envio de um email
    public boolean sendEmail(String to, String subject, String body) {
        if (to == null || subject == null|| body == null || to.isEmpty()){
            return false; // simula falha no envio se os parametros forem inválidos
        }

        String email = "para:" +to+ ",Assunto" + subject+ ",Corpo:" +body;
        sentEmails.add(email);
        System.out.println("Email enviado:" +email);
        return true;
    }

    //retorna todos os emails enviados
    public List<String> getSentEmails() {
        return sentEmails;
    }
}
