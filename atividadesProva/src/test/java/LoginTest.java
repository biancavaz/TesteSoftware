import org.example.Login;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest {

    private Login login;

    @BeforeEach
    public void setup() {
        // Configura as credenciais para cada teste
        login = new Login("bianca", 1234);
    }

    @Test
    public void testNomeUserValid() {
        Assertions.assertTrue(login.nome("bianca"));
    }

    @Test
    public void testNomeUserInvalid() {
        Assertions.assertFalse(login.nome("joao"));
    }

    @Test
    public void testSenhaValid() {
        Assertions.assertTrue(login.senha(1234));
    }

    @Test
    public void testSenhaInvalid() {
        Assertions.assertFalse(login.senha(4321));
    }

    @Test
    public void testNomeNull() {
        Assertions.assertFalse(login.nome(null));
    }
}
