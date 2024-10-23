package CicloVida;

import org.example.CicloVida.StringManipulator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// QUESTÃO 1

public class StringManipulatorTest {


    StringManipulator stringManipulator;

    @BeforeEach
    public void setUp() {
        stringManipulator = new StringManipulator();
    }

    @AfterEach
    public void tearDown() {
        stringManipulator = null;
    }

    @Test
    public void toUpperCaseTest () {
        String palavra = "teste";
        stringManipulator.toUpperCase(palavra);
        Assertions.assertEquals("TESTE", stringManipulator.toUpperCase(palavra));
    }

    @Test
    public void reverseTest () {
        String palavra = "astronauta";
        stringManipulator.reverse(palavra);
        Assertions.assertEquals("atuanortsa", stringManipulator.reverse(palavra));
    }
}
