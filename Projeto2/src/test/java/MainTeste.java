import org.example.Calculadora;
import org.example.Main;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTeste {

    @Test
    void testeSomar(){
        assertEquals(6, Calculadora.soma(4, 2));
    }

    @Test
    void testSubtrair (){
        assertEquals(15, Calculadora.subtracao(20,5));
    }
    @Test
    void testMultiplicar (){
        assertEquals(20, Calculadora.multiplicacao(10,2));
    }

    @Test
    void testDivisao () {
        assertEquals(5, Calculadora.divisao(10,2));
    }
    @Test
    void testFatorial () {
        assertEquals(120, Calculadora.fatorial(5));
    }

}
