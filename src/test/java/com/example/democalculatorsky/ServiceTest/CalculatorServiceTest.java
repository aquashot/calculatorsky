package com.example.democalculatorsky.ServiceTest;

import com.example.democalculatorsky.Service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    @Test
    void plusPositive() {
        int a = 10;
        int b = 5;
        int actual = calculatorService.plus(a, b);
        Assertions.assertEquals(15, actual);
    }

    @Test
    void plusNegative() {
        int a = -10;
        int b = -5;
        int actual = calculatorService.plus(a, b);
        Assertions.assertEquals(-15, actual);
    }

    @Test
    void minusPositive() {
        int a = 10;
        int b = 5;
        int actual = calculatorService.minus(a, b);
        Assertions.assertEquals(5, actual);
    }

    @Test
    void minusNegative() {
        int a = -10;
        int b = -5;
        int actual = calculatorService.minus(a, b);
        Assertions.assertEquals(-5, actual);
    }

    @Test
    void multiplyPositive() {
        int a = 10;
        int b = 5;
        int actual = calculatorService.multiply(a, b);
        Assertions.assertEquals(50, actual);
    }

    @Test
    void multiplyNegative() {
        int a = -10;
        int b = -5;
        int actual = calculatorService.multiply(a, b);
        Assertions.assertEquals(50, actual);
    }

    @Test
    void divisionPositive() {
        int a = 10;
        int b = 5;
        int actual = calculatorService.division(a, b);
        Assertions.assertEquals(2, actual);
    }

    @Test
    void divisionNegative() {
        int a = -10;
        int b = 1;
        int actual = calculatorService.division(a, b);
        Assertions.assertEquals(-10, actual);
        if (b == 0) {
            throw new IllegalArgumentException();
        }
    }
}
