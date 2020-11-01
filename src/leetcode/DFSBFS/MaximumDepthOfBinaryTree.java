package leetcode.DFSBFS;


class TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int x){
        this.val = x;
    }
}

public class MaximumDepthOfBinaryTree {

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(4);
        tree.left.left = new TreeNode(5);
        tree.left.right = new TreeNode(8);
        tree.left.left.left = new TreeNode(7);
        MaximumDepthOfBinaryTree a = new MaximumDepthOfBinaryTree();
        System.out.println(a.maxDepth(tree));
    }

    private int maxDepth(TreeNode tree) {

        if(tree ==null) {
            return 0;
        }

        int leftTree = maxDepth(tree.left);
        int rightTree = maxDepth(tree.right);
        return Math.max(leftTree,rightTree)+1;



    }

}
