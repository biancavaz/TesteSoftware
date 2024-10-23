package Integracao;

import org.example.Integracao.MessageQueueService;
import org.example.Integracao.MessageService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


// QUESTÃO 10
public class MessageQueueServiceTest {

    static MessageQueueService messageQueueService;
    static MessageService messageService;


    @BeforeAll
    public static void setUp () {
        messageService = new MessageService();
        messageQueueService = new MessageQueueService(messageService);

    }

    @Test
    public void testsendMessage() {


        // teste de envio bem-sucedido de notificação
        boolean result = messageQueueService.sendMessage("User@example.com", "sua conta foi atualizada.");
        assertTrue(result, "A mensagem deveria ser enviada com sucesso");


        //verifica se o email foi enviado corretamente
        assertEquals(1, messageService.getSentMessages().size());
        assertTrue(messageService.getSentMessages().get(0).contains("User@example.com"));


        //teste de falha ao enviar notificação (email inválido)
        result = messageQueueService.sendMessage("", "Mensagem sem email");
        assertFalse(result, "O envio deveria falhar com o usuário inválido");


        //teste de falha ao enviar notificação (mensagem vazia)
        result = messageQueueService.sendMessage("user@example.com", "");
        assertFalse(result, "O envio deveria falhar com mensagem vazia");
    }

    @AfterAll
    public static void tearDown () {
        messageQueueService = null;
    }
}
