package org.example.StubMock;
//QUESTÃO 13

public class EmailService {
    public boolean sendEmail(String email, String message) {  // Simulação do envio de email
        return email != null && !email.isEmpty() && message != null && ! message.isEmpty();
    }
}
