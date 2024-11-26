package org.example;

public class EmailServiceStub {

    //metodo que simula o envio de um email
    public boolean sendEmail(String recipient, String message){
        //simulação do envio do email
        return recipient != null &&
                !recipient.isEmpty() &&
                message != null &&
                !message.isEmpty();
    }
}
