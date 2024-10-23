package org.example.StubMock;

// QUESTÃO 14
public class PaymentService {

    public boolean processPayment(String userId, double amount) {
        // Simulação de processamento de pagamento
        return amount > 0;
    }
}
