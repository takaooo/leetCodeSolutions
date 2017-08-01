package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestReverseInteger {
    @Test
    public void basicTest(){

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        ReverseInteger test = new ReverseInteger();
        assertEquals(321,test.reverse(123));
        assertEquals(-123, test.reverse(-321));
        assertEquals(0,test.reverse(-1999999999));
        assertEquals(0,test.reverse(1999999999));
        assertEquals(0,test.reverse(0));
        assertEquals(1,test.reverse(10000));
        assertEquals(111,test.reverse(111));
        assertEquals(0,test.reverse(-2147483648));


    }

}
