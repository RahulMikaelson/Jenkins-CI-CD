package com.varunmatangi.jenkins;

/**
 * A simple utility class to perform basic arithmetic operations.
 */
public class Calculator {
    /**
     * Adds two numbers and returns the result.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The sum of the two numbers.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first and returns the result.
     *
     * @param a The number to subtract from.
     * @param b The number to subtract.
     * @return The result of the subtraction.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Divides the first number by the second.
     *
     * @param a The numerator.
     * @param b The denominator.
     * @return The result of the division.
     * @throws IllegalArgumentException if the denominator is zero.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
