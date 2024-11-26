import org.example.DatabaseConnection;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DatabaseConnectionTest {

    static DatabaseConnection databaseConnection;

    @BeforeAll
    public static void stup () {
        databaseConnection = new DatabaseConnection();
        databaseConnection.connect();
    }

    @Test
    public void connect() {
        Assertions.assertNotNull(databaseConnection);
    }

    @Test
    public void disconnect () {
        databaseConnection.disconnect();
    }

    @AfterAll
    public static void tearDown () {
        System.out.println("Desligada");
    }
}
