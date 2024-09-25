import org.example.OrderProcesso;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

public class OrderProcessoTest {

    private OrderProcesso process = new OrderProcesso();

    @Test
    public void testprocessOrderWithNegativeQuantidade(){
        assertThrows(IllegalArgumentException.class, () -> {
            process.processOrder(-1, 50.0);
        }, "Quantidade não pode ser negativa");
    }

    @Test
    public void  testprocessOrderWithNegativePrice () {
        assertThrows(IllegalArgumentException.class, () -> {
            process.processOrder(10, -5.0);
        }, "preço por unidade não pode ser negativo");
    }


    @ParameterizedTest
    @CsvSource({
            "1, 100.0, 100.0",
            "10, 50.0, 500.0",
    })
    public  void  testProcessOrderValidCases(int quantidade, double preco, double expectedTotal){
        double total = process.processOrder(quantidade, preco);
        assertEquals(expectedTotal, total );
    }
}
