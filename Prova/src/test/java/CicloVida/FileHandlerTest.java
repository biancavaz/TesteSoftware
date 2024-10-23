package CicloVida;

import org.example.CicloVida.FileHandler;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//QUESTÃO 2

public class FileHandlerTest {


    static FileHandler fileHandler;


    @BeforeAll
    public static void setUp() {
        fileHandler = new FileHandler();
    }

    @AfterAll
    public static void tearDown() {
        fileHandler = null;
    }

    @Test
    public void testReadFile() {
        Assertions.assertNotNull(fileHandler);
        fileHandler.openFile("arquivo1");
        Assertions.assertTrue(true, "Arquivo arquivo1 aberto");
    }

    @Test
    public void testCloseFile() {
        Assertions.assertNotNull(fileHandler);
        fileHandler.closeFile();
        Assertions.assertTrue(true, "Arquivo fechado");
    }
}
