package solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestAddTwoNumbers {

    @Test
    public void test() {
        AddTwoNumberSolution solution = new AddTwoNumberSolution();
        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(1);
        ListNode solved = solution.addTwoNumbers(l1,l2);
        assertEquals(6, solved.val);
        assertEquals(8, solved.next.val);

    }

}

