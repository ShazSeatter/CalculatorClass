import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void canAdd() {
        int num1 = 2;
        int num2 = 2;
        assertEquals(4, Calculator.add(num1, num2));
    }

    @Test
    public void canSubtract() {
        int num1 = 10;
        int num2 = 5;

        assertEquals(5, Calculator.subtract(num1, num2));
    }

    @Test
    public void canMultiply() {
        int num1 = 10;
        int num2 = 2;

        assertEquals(20, Calculator.multiply(num1, num2));
    }

    @Test
    public void canDivide() {
        int num1 = 10;
        int num2 = 5;

        assertEquals(2, Calculator.divide(num1, num2), 0.01);
    }
}
