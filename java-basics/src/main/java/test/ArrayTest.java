package test;

import basics.Array;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArrayTest {


    @Test
    public void testFindMax() {
        int[] numbers= {4,12,21,23,133131,3232,32,3201,231};
        assertEquals(133131, (Array.find(numbers)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxInEmptyArray() {
        int[] numbers= {};
        assertEquals(133131, (Array.find(numbers)));
    }

    @Test
    public void testReverseArray() {
        int[] numbers = {1,2,21,9,1,11};
        int[] expected = {11,1,9,21,2,1};
        Array.reverse(numbers);
        assertArrayEquals(expected,numbers);
    }
}
