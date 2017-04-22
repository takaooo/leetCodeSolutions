package solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGreaterTreeSolution {


    @Test
    public void test() {
        TreeNode tn1 = new TreeNode(5);
        TreeNode tn2 = new TreeNode(2);
        TreeNode tn3 = new TreeNode(13);
        TreeNode tn4 = new TreeNode(11);
        TreeNode tn5 = new TreeNode(14);
        TreeNode tn6 = new TreeNode(10);
        TreeNode tn7 = new TreeNode(12);

        tn1.left = tn2;
        tn1.right = tn3;
        tn3.left = tn4;
        tn3.right = tn5;
        tn4.left = tn6;
        tn4.right = tn7;

        assertEquals(65, new GreaterTreeSolution().convertBST(tn1).val);
    }
}
