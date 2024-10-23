import org.example.FileUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

public class FileUtilsTest {

    private FileUtils fileUtils;

    @BeforeEach
    public void inicializarTest () {
        fileUtils = new FileUtils();
    }

    @AfterEach
    public void fecharTest () {
        fileUtils = null;
    }

    @Test
    public void createFileTest (){
        
        Assertions.assertEquals("lslsl", fileUtils.createFile("lslsl"));
    }

    @Test
    public void deleteFileTest () {
        Assertions.assertTrue(fileUtils.deleteFile("lslsl"));
    }

    @Test
    public void openConnectionTest () {
        fileUtils.openConnection();
    }

    @Test
    public void closeConnection () {
        fileUtils.closeConnection();
    }
}
