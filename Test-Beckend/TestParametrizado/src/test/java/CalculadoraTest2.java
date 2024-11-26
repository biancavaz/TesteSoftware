import org.example.Calculadora;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;

public class CalculadoraTest2 {

    //metodo que fornece os dados para o teste de adição
    static Stream<org.junit.jupiter.params.provider.Arguments> provideAddData(){
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(1,2,3),

                org.junit.jupiter.params.provider.Arguments.of(5,5,10),

                org.junit.jupiter.params.provider.Arguments.of(10,15,25),

                org.junit.jupiter.params.provider.Arguments.of(-1,-1,-2)
        );
    }

    static Stream<org.junit.jupiter.params.provider.Arguments> provideSubtractData(){
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(5,2,3),

                org.junit.jupiter.params.provider.Arguments.of(10,5,5),

                org.junit.jupiter.params.provider.Arguments.of(20,10,10),

                org.junit.jupiter.params.provider.Arguments.of(0,-1, 1)
        );
    }


    @ParameterizedTest
    @MethodSource ("provideAddData")
    public void testAdd(int a, int b, int expected) {
        Calculadora calc = new Calculadora();
        assertEquals(expected, calc.add(a,b));
    }

    @ParameterizedTest
    @MethodSource ("provideSubtractData")
    public void testSubtract (int a, int b, int expected) {
        Calculadora calc = new Calculadora();
        assertEquals(expected, calc.subtract(a, b));
    }

}
