package com.example.democalculatorsky.ServiceTest;

import com.example.democalculatorsky.Service.CalculatorService;
import net.bytebuddy.asm.MemberSubstitution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class ParametrizedCalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();

    static Stream<Arguments> data() {
        return Stream.of(
                Arguments.of(1, 3),
                Arguments.of(7, 4),
                Arguments.of(12, -5),
                Arguments.of(6, 9));
    }

    @ParameterizedTest
    @MethodSource("data")
    void plus(int a, int b) {
        int expected = a + b;
        Assertions.assertEquals(expected, calculatorService.plus(a, b));
    }

    static Stream<Arguments> data1() {
        return Stream.of(
                Arguments.of(1, 3),
                Arguments.of(7, 4),
                Arguments.of(12, -5),
                Arguments.of(6, 9));
    }

    @ParameterizedTest
    @MethodSource("data1")
    void minus(int a, int b) {
        int expected = a - b;
        Assertions.assertEquals(expected, calculatorService.minus(a, b));
    }

    static Stream<Arguments> data2() {
        return Stream.of(
                Arguments.of(1, 3),
                Arguments.of(7, 4),
                Arguments.of(12, -5),
                Arguments.of(6, 9));
    }

    @ParameterizedTest
    @MethodSource("data2")
    void multiply(int a, int b) {
        int expected = a * b;
        Assertions.assertEquals(expected, calculatorService.multiply(a, b));
    }

    static Stream<Arguments> data3() {
        return Stream.of(
                Arguments.of(6, 3),
                Arguments.of(8, 4),
                Arguments.of(12, 6),
                Arguments.of(9, 9));
    }

    @ParameterizedTest
    @MethodSource("data3")
    void division(int a, int b) {
        int expected = a / b;
        Assertions.assertEquals(expected, calculatorService.division(a, b));
    }
}
