import org.example.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceTest {

    private static OrderService orderService;


    @BeforeAll
    public static void instancia () {
        orderService = new OrderService();
    }

    @BeforeEach
    public void inicia (){
        orderService.clearAllOrders();
    }

    @AfterEach
    public void tearDown () {
        System.out.println("Finalizando teste...");
    }

    @AfterAll
    public static void fechar () {
        orderService = null;

    }

    @Test
    public void OrderServiceTest (){
        Assertions.assertEquals(new ArrayList<>(), orderService.getAllOrders());
    }

    @Test
    public void addOrderTest (){
        orderService.addOrder("teste1");
        List<String> orders = orderService.getAllOrders(); // colocando dentro do array list já
        Assertions.assertEquals(1, orders.size()); // o 1 é que está esperando que teha 1 elemento
        Assertions.assertTrue(orderService.getAllOrders().contains("teste1"));
    }

    @Test
    public void removeOrderTest (){
        orderService.addOrder("Teste2");
        orderService.removeOrder("Teste2");
        List<String> orders = orderService.getAllOrders();
        Assertions.assertEquals(0, orders.size()); // está esperando que não tenha nenhum elemento
        Assertions.assertFalse(orderService.getAllOrders().contains("Teste2"));
    }

    @Test
    public void getAllOrdersTest (){
        Assertions.assertEquals("java.util.ArrayList", orderService.getAllOrders().getClass().getName());
    }

    @Test
    public void clearAllOrdersTest () {
        orderService.clearAllOrders();
        Assertions.assertEquals(new ArrayList<>(), orderService.getAllOrders());
    }
}
