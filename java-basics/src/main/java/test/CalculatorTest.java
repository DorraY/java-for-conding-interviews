package test;

import basics.Calculator;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public  class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2,3));
    }

    @Test
    public void testSubtract() {
        assertEquals(15,Calculator.substract(20,5));
    }

    @Test
    public void testMultiply() {
        assertEquals(15,Calculator.multiply(3,5));
    }

    @Test
    public void testDivide() {
        assertEquals(2,Calculator.divide(6,3));
    }

    @ParameterizedTest
    @MethodSource("dataProviderForAdd")
    public void testAddWithDataProviders(int a,int b, int expected) {
        assertEquals(expected,Calculator.add(a,b));
    }


    @Test
    public void testDivideByZero() {
        Calculator.divide(10,0);
    }

    public static Stream<Object[]> dataProviderForAdd() {
        return Stream.of(
                new Object[]{1,2,3},
                new Object[]{2,4,6},
                new Object[]{-1,1,0},
                new Object[]{3,3,6},
                new Object[]{13,2,15},
                new Object[]{1,14,15}
        );
    }
}