import org.example.EmailService;
import org.example.NotificationService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class NotificationServiceTest {

    @Test
    public void testSendNotfication() {
        //simula o serviço de email
        EmailService emailService = new EmailService();

        //serviço de notificação usando o serviço de email simulado
        NotificationService notificationService = new NotificationService(emailService);

        // teste de envi bem-sucedido de notificação
        boolean result = notificationService.sendNotification("User@example.com", "sua conata foi atualizada.");
        assertTrue(result, "A notificação deveria ser enviada com sucesso");

        //verifica se o email foi enviado corretamente
        assertEquals(1, emailService.getSentEmails().size());
        assertTrue(emailService.getSentEmails().get(0).contains("User@example.com"));

        //teste de falha ao enviar notificação (email inválido)
        result = notificationService.sendNotification("", "Mensagem sem email");
        assertFalse(result, "O envio deveria falhar com email inválido");

        //teste de falha ao enviar notificação (mensagem vazia)
        result = notificationService.sendNotification("user@example.com", "");
        assertFalse(result, "O envio deveria falhar com mensagem vazia");


    }
}
