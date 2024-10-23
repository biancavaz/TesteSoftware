package TDD;
// QUESTÃO 4

import org.example.TDD.FractionCalculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionCalculatorTest {

    static FractionCalculator fractionCalculator;

    @BeforeAll
    public static void setUp () {
        fractionCalculator = new FractionCalculator ();
    }

    @AfterAll
    public static void tearDown () {
        fractionCalculator = null;
    }

    @Test
    public void somarTest () {
        assertEquals(1, fractionCalculator.somar(0.5, 0.5));
        assertEquals(0, fractionCalculator.somar(-0.5, 0.5));
        assertEquals(-0.5, fractionCalculator.somar(-0.5, 0));
    }

    @Test
    public void subtrairTest () {
        assertEquals(0, fractionCalculator.subtrair(0.5, 0.5));
        assertEquals(-1, fractionCalculator.subtrair(-0.5, 0.5));
    }

    @Test
    public void multiplicarTest () {
        assertEquals(0.25, fractionCalculator.multiplicar(0.5, 0.5));
        assertEquals(-0.25, fractionCalculator.multiplicar(-0.5, 0.5));
    }

}
