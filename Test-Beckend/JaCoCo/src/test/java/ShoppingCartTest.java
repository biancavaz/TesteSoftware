
import org.example.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

    public class ShoppingCartTest {

        private ShoppingCart cart;

        @BeforeEach
        public void setUp() {
            cart = new ShoppingCart();
        }

        @Test
        public void testAddItem(){
            cart.addItem(new Item("Produto 1", 10.0));
            assertEquals(1,cart.getItemCount());
        }

        @Test
        public void testCalculeTotal () {
            cart.addItem(new Item("Produto 1", 10.0));
            cart.addItem(new Item("Produto 2", 20.0));
            assertEquals(30.0, cart.calculeTotal());

        }
    }

