package org.example.Integracao;

//QUESTÃO 10
public class MessageQueueService {

    private MessageService messageService;

    public MessageQueueService(MessageService messageService){
        this.messageService = messageService;
    }


    public boolean sendMessage(String userMessage, String message) {
        if (userMessage == null || message == null || message.isEmpty()){
            return false; //falha ao enviar notificação se os parametros forem inválidos
        }

        //Simulação de envio de mensagem para uma fila
        String subject = " notificação Importante";
        return messageService.sendMessages(userMessage, subject, message) ;
    }
}
