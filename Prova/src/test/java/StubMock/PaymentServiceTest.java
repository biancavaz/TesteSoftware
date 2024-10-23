package StubMock;

import org.example.StubMock.PaymentService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// QUESTÃO 14
public class PaymentServiceTest {

    static PaymentService paymentServiceStub;

    @BeforeAll
    public static void setUp () {
        paymentServiceStub = new PaymentService();
    }

    @Test
    public void processPaymentSuccessTest () {

        boolean result = paymentServiceStub.processPayment("34", 100.0);
        assertTrue(result, "O pedido deveria ser processado com sucesso");

    }

    @Test
    public void processPaymentFailureTest () {

        boolean result = paymentServiceStub.processPayment("12345", -100.0);
        assertFalse(result, "O pedido deveria fahar devido á falha no pagamento");

    }

    @AfterAll
    public static void tearDown () {
        paymentServiceStub = null;
    }

}
