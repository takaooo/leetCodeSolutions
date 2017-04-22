package solutions;

public class GreaterTreeSolution {

    private int sum;
    public TreeNode convertBST(TreeNode root) {
        sum = 0;
        return innertConverter(root);
    }
    private TreeNode innertConverter(TreeNode root){
        if(root == null)
            return null;

        if(root.right != null){
            innertConverter(root.right);
        }
        root.val += sum;
        sum = root.val;
        if(root.left != null){
            innertConverter(root.left);
        }
        return root;
    }

}
