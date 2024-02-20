package test;

import basics.Array;
import basics.Strings;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringsTest {

    @Test
    public void testPalindrome() {

        assertTrue(Strings.isPalindrome("azzA"));
        assertFalse(Strings.isPalindrome("zaZa"));
        assertFalse(Strings.isPalindrome("kouti"));
    }
}
