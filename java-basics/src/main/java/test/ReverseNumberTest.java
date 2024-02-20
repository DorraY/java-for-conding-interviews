package test;

import basics.ReverseNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseNumberTest {

    @Test
    public void testReverse() {
        assertEquals(0, ReverseNumber.reverseNumber(0));
    }
}
