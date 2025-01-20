import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeFactoryTest {

    /**
     *  Inte ett så bra test eftersom resultatet från metoden som testas
     *  använder random. Testet kan alltså ibland gå igenom, ibland inte!
     */

    @Test
    void testCreateExpensiveBike() {
        double price = BikeFactory.createExpensiveBike("a").getGrossPrice();
        assertTrue(price >= 800, String.format("price %.2f not >= 800", price));
    }

}