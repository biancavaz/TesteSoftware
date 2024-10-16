import org.example.EmailServiceStub;
import org.example.NotificationServiceStub;
import org.junit.jupiter.api.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class NotificationServiceStubTest {

    @Test
    public void testNotifyUserSeccess() {
        //criar um stub de emailService
        EmailServiceStub emailServiceStub  = new EmailServiceStub();

        //injetar o stub no NotificationService
        NotificationServiceStub notificationServiceStub = new NotificationServiceStub(emailServiceStub);

        //verificar se a notificação foi enviada com sucesso
        boolean result = notificationServiceStub.notifyUser("user@example.com", "voce tem uma nova notificação");

        assertTrue("a notificação deveria ser enciada com sucesso", result);
    }

    @Test
    public void testNotifyUserFailure() {
        //criar um stub de emailService
        EmailServiceStub emailServiceStub = new EmailServiceStub();

        NotificationServiceStub notificationServiceStub = new NotificationServiceStub(emailServiceStub);

        //verificar falha na notificação com destinatário inválido
        boolean result = notificationServiceStub.notifyUser(null, "voce tem uma nova notificação");
        assertFalse("A notificação deveria falhar com destinatário inválido", result);

    }

}
