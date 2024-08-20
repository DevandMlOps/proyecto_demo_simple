package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAdd() {
        App calculator = new App();
        assertEquals(5, calculator.add(3, 2));
    }

    @Test
    public void testSubtract() {
        App calculator = new App();
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        App calculator = new App();
        assertEquals(6, calculator.multiply(3, 2));
    }

    @Test
    public void testDivide() {
        App calculator = new App();
        assertEquals(1.5, calculator.divide(3, 2));
    }

    @Test
    public void testDivideByZero() {
        App calculator = new App();
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(3, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
