package solutions;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLengthOfLongestSubstring {

    private LengthOfLongestSubstring solution;

    @Before
    public void setup() {
        solution = new LengthOfLongestSubstring();
    }


    @Test
    public void testSol1_bpfbhmipx() {
        Assert.assertEquals(7, solution.lengthOfLongestSubstring("bpfbhmipx"));
    }


    @Test
    public void testSol1_aaaa() {
        Assert.assertEquals(1, solution.lengthOfLongestSubstring("aaaa"));
    }


    @Test
    public void testSol1_d() {
        Assert.assertEquals(1, solution.lengthOfLongestSubstring("d"));
    }


    @Test
    public void testSol1_abc() {
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("abc"));
    }


    @Test
    public void testSol1_pwwkew() {
        Assert.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }


    @Test
    public void testSol1_aa() {
        Assert.assertEquals(1, solution.lengthOfLongestSubstring("aa"));
    }


    @Test
    public void testSol2_bpfbhmipx() {
        Assert.assertEquals(7, solution.sol2("bpfbhmipx"));
    }

    @Test
    public void testSol2_aaaa() {
        Assert.assertEquals(1, solution.sol2("aaaa"));
    }

    @Test
    public void testSol2_d() {
        Assert.assertEquals(1, solution.sol2("d"));
    }

    @Test
    public void testSol2_abc() {
        Assert.assertEquals(3, solution.sol2("abc"));
    }

    @Test
    public void testSol2_pwwkew() {
        Assert.assertEquals(3, solution.sol2("pwwkew"));
    }

    @Test
    public void testSol2_aa() {
        Assert.assertEquals(1, solution.sol2("aa"));
    }


}
