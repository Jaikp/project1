package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    // Test for addition
    @Test
    void testAddition() {
        App classUnderTest = new App();
        assertEquals(5, classUnderTest.add(2, 3), "2 + 3 should equal 5");
    }

    // Test for subtraction
    @Test
    void testSubtraction() {
        App classUnderTest = new App();
        assertEquals(2, classUnderTest.subtract(4, 3), "4 - 3 should equal 1");
    }

    // Test for multiplication
    @Test
    void testMultiplication() {
        App classUnderTest = new App();
        assertEquals(6, classUnderTest.multiply(2, 3), "2 * 3 should equal 6");
    }

    // Test for division
    @Test
    void testDivision() {
        App classUnderTest = new App();
        assertEquals(2, classUnderTest.divide(6, 3), "6 / 3 should equal 2");
    }

    // Test for division by zero
    @Test
    void testDivisionByZero() {
        App classUnderTest = new App();
        assertThrows(ArithmeticException.class, () -> classUnderTest.divide(1, 0), "Division by zero should throw ArithmeticException");
    }
}
