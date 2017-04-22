package solutions; /**
 * Definition for a binary tree node.
 * public class solutions.TreeNode {
 *     int val;
 *     solutions.TreeNode left;
 *     solutions.TreeNode right;
 *     solutions.TreeNode(int x) { val = x; }
 * }
 */
public class TreeSolution {
    public int diameterOfBinaryTree(TreeNode root) {
        return resultOfBinaryTree(root).diameter;
    }

    private TreeResult resultOfBinaryTree(TreeNode root){
        if(root == null){
            return new TreeResult(0,0);
        }
        TreeResult trl = resultOfBinaryTree(root.left);
        TreeResult trr = resultOfBinaryTree(root.right);

        int diameter = trl.length+trr.length;
        int length = 0;
        if(trl.length > trr.length){
            length = trl.length;
        } else {
            length = trr.length;
        }

        return new TreeResult(max(diameter, trl.diameter, trr.diameter),++length);
    }

    private int max(int... ints){
        int result = 0;
        for(int i : ints){
            if(i > result)
                result = i;
        }
        return result;
    }


    class TreeResult{
        int diameter;
        int length;
        TreeResult(int diameter, int length){
            this.diameter = diameter;
            this.length = length;
        }
    }

    public static void main(String[] args) {
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
        System.out.println("ans: " + ts.diameterOfBinaryTree(tn1));

    }
}
