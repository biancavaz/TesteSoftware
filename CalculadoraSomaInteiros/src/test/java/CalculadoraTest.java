import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {

        @Test
        public void testSoma() {
            Calculadora calc = new Calculadora();
            assertEquals(5, calc.soma(2,3)); // teste com números diferentes
            assertEquals(0, calc.soma(0,0)); // teste com número iguais
            assertEquals(-1, calc.soma(0,-1)); // teste com 0
            assertEquals(1, calc.soma(3,-2)); //teste com números negativos
    }
}
