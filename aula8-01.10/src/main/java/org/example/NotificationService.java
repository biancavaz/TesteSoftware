package org.example;

import org.example.EmailService;

public class NotificationService {

    private EmailService emailService;

    //construtor que recebe o emailService como dependencia
    public NotificationService(EmailService emailService){
        this.emailService = emailService;
    }

    //simula o envio de uma notificacao
    public boolean sendNotification(String userEmail, String message){
        if (userEmail == null || message == null || message.isEmpty()){
            return false; //falha ao enviar notificação se os parametros forem inválidos
        }
        String subject = "notificação Importante";
        return emailService.sendEmail(userEmail, subject, message);
    }
}
