package Excecao;

import org.example.Excecao.FileLoader;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

// QUESTÃO 6

public class FileLoaderTest {
    static FileLoader fileLoader;

    @BeforeAll
    public static void setUp() {
        fileLoader = new FileLoader();
    }
    @AfterAll
    public static void tearDown() {
        fileLoader = null;
    }

    @Test
    public void loadFileTest() {
        Exception exception = assertThrows(Exception.class, ()->fileLoader.loadFile("caminho"));
        assertEquals("Arquivo não encontrado", exception.getMessage());
    }
}
