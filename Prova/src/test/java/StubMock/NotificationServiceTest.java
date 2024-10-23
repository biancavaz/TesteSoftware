package StubMock;

import org.example.StubMock.EmailService;
import org.example.StubMock.NotificationService;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

//QUESTÃO 13
public class NotificationServiceTest {
    @Test
    public void notificationTest() {
        EmailService emailService = mock(EmailService.class);

        when(emailService.sendEmail("gabriel@gmail.com", "mensagem")).thenReturn(true);

        NotificationService notificationService = new NotificationService(emailService);

        assertTrue(notificationService.sendNotification("gabriel@gmail.com", "mensagem"));

    }
}
