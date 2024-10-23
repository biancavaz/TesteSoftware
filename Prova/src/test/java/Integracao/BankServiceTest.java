package Integracao;

// QUESTÃO 9

import org.example.Integracao.AuthenticationService;
import org.example.Integracao.BankService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BankServiceTest {

    static BankService bankService;
    static AuthenticationService authenticationService;
    @BeforeAll
    public static void setUp() {
        authenticationService = new AuthenticationService();
        bankService = new BankService(authenticationService);
    }

    @Test
    public void loginTestSuccess() {
        assertTrue(bankService.login("admin", "admin"));
    }
    @Test
    public void loginTestErro(){
        assertFalse(bankService.login("admin", "1234"));
    }

    @AfterAll
    public static void tearDown() {
        bankService = null;
    }

}

