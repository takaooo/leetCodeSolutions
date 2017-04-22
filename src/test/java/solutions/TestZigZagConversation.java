package solutions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestZigZagConversation {
    private ZigZagConversation solution;

    @Before
    public void setup(){
        solution = new ZigZagConversation();
    }

    @Test
    public void testConvert_paypalishiring1() {
        assertEquals("paypalishiring",solution.convert("paypalishiring", 1));
    }


    @Test
    public void testConvert_paypalishiring3() {
        assertEquals("pahnaplsiigyir",solution.convert("paypalishiring",3));
    }

    @Test
    public void testConvert_pa3() {
        assertEquals("pa",solution.convert("pa",5));
    }
}
