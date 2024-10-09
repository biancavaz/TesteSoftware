import org.example.AuthService;
import org.example.User;
import org.example.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class AuthServiceTest {

    @Test
    public void testLoginSuccess() {
        UserRepository userRepository = Mockito.mock(UserRepository.class);

        User mockUser = new User ("john_doe", "password123");

        //configurar o comportamento esperado
        when(userRepository.findUserByUsername("john_doe")).thenReturn(mockUser);

        //testar o AuthService com o mock injetado
        AuthService authService = new AuthService(userRepository);
        boolean result = authService.login("john_doe", "password123");

        assertTrue(result, "O login deveria ser bem-sucedido");

    }

    @Test
    public void testLoginFailureInvalidPassword(){
        UserRepository userRepository = Mockito.mock(UserRepository.class);
        User mockUser = new User("john_doe", "password123");


        when (userRepository.findUserByUsername("john_doe")).thenReturn(mockUser);

        AuthService authService = new AuthService(userRepository);
        boolean result = authService.login("john_doe", "wrongpassword");

        assertFalse(result, "O login deveria falhar com senha inválida");
    }

    @Test
    public void testLoginFailureUserNotFound() {
        UserRepository userRepository = Mockito.mock(UserRepository.class);

        //simula que o usuário não foi encontrado
        when(userRepository.findUserByUsername("john_doe")).thenReturn(null);

        AuthService authService = new AuthService(userRepository);
        boolean reult = authService.login("john_doe", "password123");

        assertFalse(reult, "O login deveria falhar se o usuário não for encontrado");
    }
}
