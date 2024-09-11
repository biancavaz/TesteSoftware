import org.example.DatabaseUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
public class DatabaseUtilsTest {

    private DatabaseUtils database;

    @BeforeEach
    public void instanciar () {
        database = new DatabaseUtils();
    }

    @AfterEach
    public void tirar (){
        database =  null;
    }

    @Test
    public void connectTest () {
        database.connect();
        Assertions.assertTrue(database.isConnected());
    }

    @Test
    public void disconectTest () {
        database.connect();
        Assertions.assertTrue(database.isConnected());
        database.disconect();
        Assertions.assertFalse(database.isConnected());
    }
}
