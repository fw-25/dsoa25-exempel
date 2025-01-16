import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CCTestingOverloadTest {

    @Test
    void testMultiplyTwoArgs() {
        //CCTestingOverload calculator = new CCTestingOverload();
        assertEquals(10, (new CCTestingOverload()).multiply(5, 2));
    }

    @Test
    void testMultiplyThreeArgs() {
        assertEquals(100, (new CCTestingOverload()).multiply(5, 2, 10));
    }
}