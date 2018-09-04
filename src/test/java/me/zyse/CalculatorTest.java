package me.zyse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for calculator
 */
public class CalculatorTest
{
    @Test
    public void shouldReturnZeroForZeroItems()
    {
        assertEquals(Calculator.calculateTotal(0, 10.0, "UT"), 0.0, 0.0);
    }

    @Test
    public void shouldReturnZeroForZeroPrice()
    {
        assertEquals(Calculator.calculateTotal(10, 0.0, "UT"), 0.0, 0.0);
    }

    // The following tests are failing and are meant as part of the specification for the implementation. Make them green.
    @Test(expected = InvalidInputException.class)
    public void shouldThrowAnExceptionForInvalidInput()
    {
        Calculator.calculateTotal(0, -5.0, "UT");
    }

    @Test
    public void shouldCalculateCorrectForUT()
    {
        assertEquals(Calculator.calculateTotal(100, 49.95, "UT"), 5177.04, 0.004);
    }

    @Test
    public void shouldCalculateCorrectForTX()
    {
        assertEquals(Calculator.calculateTotal(200, 499.00, "TX"), 90131.875, 0.004);
    }
}
