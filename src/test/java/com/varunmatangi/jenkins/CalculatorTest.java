package com.varunmatangi.jenkins;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * JUnit 5 test class for the Calculator.
 */
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        // Test a simple addition.
        assertEquals(5, calculator.add(2, 3));
        // Test with negative numbers.
        assertEquals(-1, calculator.add(2, -3));
        System.out.println("Add test passed.");
    }

    @Test
    void testSubtract() {
        // Test a simple subtraction.
        assertEquals(1, calculator.subtract(3, 2));
        // Test with negative numbers.
        assertEquals(5, calculator.subtract(2, -3));
        System.out.println("Subtract test passed.");
    }

    @Test
    void testDivide() {
        // Test a simple division.
        assertEquals(2.0, calculator.divide(4, 2));
        // Test with a decimal result.
        assertEquals(2.5, calculator.divide(5, 2));
        System.out.println("Divide test passed.");
    }

    @Test
    void testDivideByZero() {
        // Test that dividing by zero throws an exception.
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(1, 0),
                "Expected divide() to throw, but it didn't"
        );
        assertTrue(thrown.getMessage().contains("Cannot divide by zero"));
        System.out.println("Divide by zero test passed.");
    }
}
