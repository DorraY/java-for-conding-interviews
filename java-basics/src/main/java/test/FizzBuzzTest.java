package test;
import basics.Calculator;
import basics.FizzBuzz;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzWithSmallString() {
        List<String> expectedList = new ArrayList<>();

        expectedList.add("1");
        expectedList.add("2");
        expectedList.add("Fizz");
        assertIterableEquals(expectedList,FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void testFizzBuzzWithLongString() {
        List<String> expectedList = new ArrayList<>(Arrays.asList("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"));

        assertIterableEquals(expectedList,FizzBuzz.fizzBuzz(15));
    }
}
