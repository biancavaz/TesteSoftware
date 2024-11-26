import org.example.BankAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    BankAccount bankAccount;

    @BeforeEach
    public void setup () {
        bankAccount = new BankAccount(1500);
    }

    @Test
    public void withdrawSucessTest () throws Exception {
        bankAccount.withdraw(1000);
        Assertions.assertEquals(500, bankAccount.getBalance());
    }

    @Test
    public void withdrawExeptionTest () {
        Exception exception = Assertions.assertThrows(Exception.class, () -> {
            bankAccount.withdraw(1800);
        });

        Assertions.assertEquals("Saldo insuficiente", exception.getMessage());
    }
}
