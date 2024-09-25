import org.example.CalculadoraExe;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraExeTest {

    @Test
    public void testDivide () throws IllegalAccessException {
        CalculadoraExe calc = new CalculadoraExe();
        assertEquals(2, calc.divide(4,2));
    }

    @Test
    public void testDivideByZero() {
        CalculadoraExe calc = new CalculadoraExe();
        assertThrows(IllegalAccessException.class, () -> calc.divide(4,0),
                "Divisor não pode ser zero");

    }

}
