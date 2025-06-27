
package ejercicio_01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    
    public ShoppingCartTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    // HAPPY PATH 
    @Test
    public void testGetTotal() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(19.0);
        cart.addProduct(24.5);
        assertEquals(2,cart.getProductCount());
        assertEquals(43.5,cart.getTotal());

    }

    ///UNHAPPY PATH
    @Test
    public void testProductoInvalido() {
        ShoppingCart cart = new ShoppingCart();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cart.addProduct(-5.0);
        });
        assertEquals("Price must be positive", exception.getMessage());

    }
    
    @Test
    public void testRemoveProduct() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(10.0);
        cart.addProduct(20.0);
        cart.removeProduct(10.0);

        assertEquals(1, cart.getProductCount());
        assertEquals(20.0, cart.getTotal());
    }

    
}
