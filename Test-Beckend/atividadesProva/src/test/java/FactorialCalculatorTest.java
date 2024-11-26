import org.example.FactorialCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {

    static FactorialCalculator factorialCalculator;

    @BeforeAll
    public static void setup () {
        factorialCalculator = new FactorialCalculator();
    }

        @Test
        public void testFactorial() {
            Assertions.assertEquals(1, factorialCalculator.factorial(0));
            Assertions.assertEquals(1, factorialCalculator.factorial(1));
            Assertions.assertEquals(2, factorialCalculator.factorial(2));
            Assertions.assertEquals(6, factorialCalculator.factorial(3));
            Assertions.assertEquals(120, factorialCalculator.factorial(5));
        }

        @Test
        public void testFactorialOfNegative() {
            FactorialCalculator calculator = new FactorialCalculator();
            Assertions.assertThrows(StackOverflowError.class, () -> {
                calculator.factorial(-1); // Comportamento não definido para números negativos
            });
        }
    }


