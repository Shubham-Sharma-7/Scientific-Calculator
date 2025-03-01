
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.esdpracticals.ScientificCalculator;
import org.junit.jupiter.api.Test;

class ScientificCalculatorTest {

    @Test
    void testSquareRoot() {
        assertEquals(3.0, ScientificCalculator.squareRoot(9), 0.001);
        assertEquals(5.0, ScientificCalculator.squareRoot(25), 0.001);
        assertThrows(IllegalArgumentException.class, () -> ScientificCalculator.squareRoot(-4));
    }

    @Test
    void testFactorial() {
        assertEquals(1, ScientificCalculator.factorial(0));
        assertEquals(1, ScientificCalculator.factorial(1));
        assertEquals(120, ScientificCalculator.factorial(5));
        assertEquals(720, ScientificCalculator.factorial(6));
        assertThrows(IllegalArgumentException.class, () -> ScientificCalculator.factorial(-3));
    }

    @Test
    void testNaturalLog() {
        assertEquals(0.0, ScientificCalculator.naturalLog(1), 0.001);
        assertEquals(Math.log(10), ScientificCalculator.naturalLog(10), 0.001);
        assertThrows(IllegalArgumentException.class, () -> ScientificCalculator.naturalLog(0));
        assertThrows(IllegalArgumentException.class, () -> ScientificCalculator.naturalLog(-5));
    }

    @Test
    void testPower() {
        assertEquals(8.0, ScientificCalculator.power(2, 3), 0.001);
        assertEquals(1.0, ScientificCalculator.power(5, 0), 0.001);
        assertEquals(0.5, ScientificCalculator.power(2, -1), 0.001);
    }
}
