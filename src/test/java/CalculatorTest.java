import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(3.12, calculator.add(1.1, 2.02), 0.01);
    }
    @Test
    public void canSubtract(){
        assertEquals(3.08, calculator.subtract(6.16, 2), 0.01);
    }
    @Test
    public void canMultiply(){
        assertEquals(9.09, calculator.multiply(3.03, 3), 0.01);
    }
    @Test
    public void canDivide(){
        assertEquals(2.02, calculator.divide(6.06, 3), 0.01);
    }
}
