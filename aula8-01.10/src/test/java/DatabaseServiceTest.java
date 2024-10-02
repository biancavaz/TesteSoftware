import org.example.DatabaseService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DatabaseServiceTest {

    private DatabaseService dbService = new DatabaseService();

    @Test
    public void testSimulatedDatabaseConnection(){
        //simular conexão
        dbService.connect();

        //simular inserção de usuário e verificar sucesso
        boolean insertResult = dbService.insertUser(1,"Alice");
        assertTrue(insertResult, "falha ao inserir o usuário alice");

        //simular inserção de um segundo usuário
        insertResult= dbService.insertUser(2,"Bob");
        assertTrue(insertResult, "Falha ao inserir o usuário Bob");

        //simular falha ao inserir usuário com ID duplicado
        insertResult = dbService.insertUser(1, "Charlie");
        assertFalse(insertResult, "deveria falhar so inserir usuário com id duplicado");

        //simular consulta de usuário existente
        String user = dbService.findUserById(1);
        assertEquals("Alice", user, "Usuário com Id 1 deveria ser Alice");

        //simular consulta de usuário inexistente
        user = dbService.findUserById(3);
        assertNull(user, "Não deveria haver um usuário com ID 3");

        //simular desconexão
        dbService.disconnect();
    }
}
