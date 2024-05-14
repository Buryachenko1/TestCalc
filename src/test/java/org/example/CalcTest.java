package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalcTest {

    @BeforeAll
    public static void setUp() {
        System.out.println("Before All");
    }

    @BeforeEach
    void setupEach() {
        System.out.println("Before Each");
    }

    @AfterAll
    static void setUpAll() {
        System.out.println("After All");
    }

    @Test
    @DisplayName("Check of the sum 1")
    @Timeout(5)
    @Tag("SmokeCalc")
    void summ1() {
        Calc calc = new Calc();
        int result = calc.summ(8, 6);
        Assertions.assertEquals(14, result, "assertion failed due to an incorrect result of the sum");
    }

    @RepeatedTest(2)
    @DisplayName("Check of the sum 2")
    @Timeout(5)
    void summ2() {
        Calc calc = new Calc();
        int result = calc.summ(5, 6);
        Assertions.assertEquals(11, result, "assertion failed due to an incorrect result of the sum");
    }

    @ParameterizedTest(name = "#{index} - sum {0} and {1}, expect {2}")
    @DisplayName("Check of the sum")
    @CsvSource({"1, 2, 3", "-1, 2, 1", "0, 0, 0"})
    @Tag("sum")
    void summ3(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int sumResult = calc.summ(a, b);
        Assertions.assertEquals(expectedResult, sumResult, "assertion failed due to an incorrect result of the sum");
    }

    @ParameterizedTest(name = "#{index} - subtract {1} from {0}, expect {2}")
    @DisplayName("Check of the subtraction")
    @CsvSource({"10, 5, 5", "-1, -2, 1", "0, 0, 0"})
    @Tag("sub")
    void sub(int a, int b, int expectedResult) {
        Calc calc = new Calc();
        int subResult = calc.sub(a, b);
        Assertions.assertEquals(expectedResult, subResult, "assertion failed due to an incorrect result of the subtraction");
    }
}