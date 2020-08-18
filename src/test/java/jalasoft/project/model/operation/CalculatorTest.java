package jalasoft.project.model.operation;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private static final double DELTA = 0.0;

    @Test
    public void addTwoPositiveNumbersResult20() {
        double expected = 20;
        double result = Calculator.add(5, 15);
        assertEquals("Adding 5 to 15 should give me 20", expected, result, DELTA);
    }

    @Test
    public void subtractTwoNullValuesResult0() throws Exception {
        double expected = 0;
        double result = Calculator.subtract(null,null);
        assertEquals("Subtracting null from null should give me 0", expected, result, DELTA);
    }

    @Test
    public void factorialNegativeNumberResult0() {
        double expected = 0;
        double result = Calculator.factorial(-8);
        assertEquals("-8! = 0", expected, result, DELTA);
    }

    @Test
    public void divideByZeroResultErrorMessage() throws Exception {
        try {
            Calculator.divide(10, 0);
        } catch (Exception ex) {
            String result = ex.getMessage();
            assertEquals(result, "Divide by zero gives infinity as result");
        }
    }
}