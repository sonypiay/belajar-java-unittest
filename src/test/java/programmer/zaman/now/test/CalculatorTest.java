package programmer.zaman.now.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import programmer.zaman.now.test.generator.SimpleNameGenerator;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(value = SimpleNameGenerator.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess() {
        var result = calculator.add(10, 10);
        assertEquals(20, result);
    }

    @Test
    @Disabled
    public void testAddFailed() {
        var result = calculator.add(10, 10);
        assertNotEquals(100, result);
    }

    @Test
    public void testDivideSuccess() {
        var result = calculator.divide(100, 10);
        assertEquals(10, result);
    }

    @Test
    public void testDivideFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
