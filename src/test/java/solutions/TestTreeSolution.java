package solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTreeSolution {

    @Test
    public void test1() {
        TreeNode tn1 = new TreeNode(1);
        TreeNode tn2 = new TreeNode(1);
        TreeNode tn3 = new TreeNode(1);
        TreeNode tn4 = new TreeNode(1);
        TreeNode tn5 = new TreeNode(1);
        TreeNode tn6 = new TreeNode(1);
        TreeNode tn7 = new TreeNode(1);
        TreeNode tn8 = new TreeNode(1);
        TreeNode tn9 = new TreeNode(1);
        TreeNode tn10 = new TreeNode(1);
        TreeNode tn11 = new TreeNode(1);
        TreeNode tn12 = new TreeNode(1);

        tn1.left = tn2;
        tn1.right = tn3;
        tn2.left = tn4;
        tn2.right = tn5;
        tn4.left = tn6;
        tn4.right = tn7;
        tn5.left = tn8;
        tn5.right = tn9;
        tn6.left = tn10;
        tn6.right = tn11;
        tn8.left =  tn12;

        TreeSolution ts = new TreeSolution();
        assertEquals(6,ts.diameterOfBinaryTree(tn1));

    }
}
