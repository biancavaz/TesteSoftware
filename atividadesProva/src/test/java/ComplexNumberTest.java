import org.example.ComplexNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComplexNumberTest {

    @Test
    public void testAddition() {
        ComplexNumber num1 = new ComplexNumber(1, 2); // 1 + 2i
        ComplexNumber num2 = new ComplexNumber(3, 4); // 3 + 4i
        ComplexNumber result = num1.add(num2); // Espera-se 4 + 6i

        Assertions.assertEquals(4, result.getRealPart());
        Assertions.assertEquals(6, result.getImaginaryPart());
    }

    @Test
    public void testSubtraction() {
        ComplexNumber num1 = new ComplexNumber(5, 3); // 5 + 3i
        ComplexNumber num2 = new ComplexNumber(2, 1); // 2 + 1i
        ComplexNumber result = num1.subtract(num2); // Espera-se 3 + 2i

        Assertions.assertEquals(3, result.getRealPart());
        Assertions.assertEquals(2, result.getImaginaryPart());
    }

    @Test
    public void testAdditionWithNegative() {
        ComplexNumber num1 = new ComplexNumber(-1, -2); // -1 - 2i
        ComplexNumber num2 = new ComplexNumber(3, 4); // 3 + 4i
        ComplexNumber result = num1.add(num2); // Espera-se 2 + 2i

        Assertions.assertEquals(2, result.getRealPart());
        Assertions.assertEquals(2, result.getImaginaryPart());
    }

    @Test
    public void testSubtractionWithNegative() {
        ComplexNumber num1 = new ComplexNumber(1, 1); // 1 + i
        ComplexNumber num2 = new ComplexNumber(-1, -1); // -1 - i
        ComplexNumber result = num1.subtract(num2); // Espera-se 2 + 2i

        Assertions.assertEquals(2, result.getRealPart());
        Assertions.assertEquals(2, result.getImaginaryPart());
    }
}
