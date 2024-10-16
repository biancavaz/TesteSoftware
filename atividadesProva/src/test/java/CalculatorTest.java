import org.example.Calculator;
import org.junit.jupiter.api.*;

public class CalculatorTest {

    static Calculator calculator;

    @BeforeAll
    public static void setupAll (){
        System.out.println("Execução antes de todos os testes");
    }

    @BeforeEach
    public void setup() {
        calculator = new Calculator();
        System.out.println("Execução de cada teste");
    }

    @Test
    public void addTest (){
        Assertions.assertEquals(15, calculator.add(5,10));
    }

    @Test
    public void subtractTest () {
        Assertions.assertEquals(10, calculator.subtract(15,5));
    }

    @AfterEach
    public void tearDownAll () {
        System.out.println("execução após cada teste");
    }
    @AfterAll
    public static void tearDown () {
        calculator = null;
        System.out.println("Memória limpa!");
    }

}
