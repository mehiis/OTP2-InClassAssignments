package Week_1.in_class;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

class ConsoleShoppingCartTest {
    ConsoleShoppingCart cart = new ConsoleShoppingCart();

    @Test
    public void TestCalculateTotalPrice(){
        assertEquals(10.0, cart.calculateTotalPrice(10.0, 1), 0.1);
        assertEquals(20.0, cart.calculateTotalPrice(20.0, 1), 0.1);
        assertEquals(60.0, cart.calculateTotalPrice(30.0, 2), 0.1);
    }

}