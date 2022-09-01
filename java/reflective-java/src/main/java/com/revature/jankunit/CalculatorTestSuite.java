package com.revature.jankunit;

public class CalculatorTestSuite {

    // SUT = System Under Test (the thing being tested)
    Calculator sut = new Calculator();

    @Test
    public void test_add_returnsCorrectAnswer() {
        int expected = 4;
        int actual = sut.add(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void test_add_returnsCorrectAnswer_evenWithNegatives() {
        int expected = 1;
        int actual = sut.add(3, -2);
        assertEquals(expected, actual);
    }

    @Test
    public void test_subtract_returnsCorrectAnswer() {
        int expected = 0;
        int actual = sut.subtract(2, 2);
        assertEquals(expected, actual);
    }

    @Test
    public void test_multiply_returnsCorrectAnswer() {
        int expected = 25;
        int actual = sut.multiply(5, 5);
        assertEquals(expected, actual);
    }

    public static void assertEquals(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionException("Assertion condition not met!");
        }
    }
}
