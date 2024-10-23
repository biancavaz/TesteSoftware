package org.example.StubMock;
//QUESTÃO 13

public class NotificationService {
    private EmailService emailService;
    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }
    public boolean sendNotification(String email, String message) {
        return emailService.sendEmail(email, message);
    }
}