package TDD;

import org.example.TDD.BankAccount;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
// QUESTÃO 3
public class BankAccountTest {

    static BankAccount bankAccount;

    @BeforeAll
    public static void setup(){
        bankAccount = new BankAccount(0);
    }

    @AfterAll
    public static void teardown(){
        bankAccount = null;
    }

    @Test
    public void consultarTest(){
        assertEquals(0, bankAccount.mostrar());
    }

    @Test
    public void sacarTest(){
        assertTrue(bankAccount.sacar(100));
        assertFalse(bankAccount.sacar(200));
        assertFalse(bankAccount.sacar(-200));
        assertFalse(bankAccount.sacar(0));

    }
    @Test
    public void depositoTest(){
        assertTrue(bankAccount.depositar(100));
        assertFalse(bankAccount.depositar(-50));

    }



}
