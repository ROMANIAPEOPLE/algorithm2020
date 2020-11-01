package leetcode.DFSBFS;

import java.util.Stack;

public class MaximumDepthOfBinaryTree_dfsStack {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(4);
        tree.left.left = new TreeNode(5);
        tree.left.right = new TreeNode(8);
        tree.left.left.left = new TreeNode(7);
        MaximumDepthOfBinaryTree a = new MaximumDepthOfBinaryTree();

    }

    public int dfs(TreeNode tree) {
        if (tree == null) {
            return 0;
        }
        Stack<TreeNode> treeNodes = new Stack<>();
        Stack<Integer> value = new Stack<>();

        treeNodes.push(tree);
        value.push(1);
        int max = 0;
        while (!treeNodes.isEmpty()) {
            TreeNode treeNode = treeNodes.pop();
            int val = value.pop();
            max = Math.max(max, val);
            if (treeNode.left != null) {
                treeNodes.push(treeNode.left);
                value.push(val + 1);
            }
            if (treeNode.right != null) {
                treeNodes.push(treeNode.right);
                value.push(val + 1);
            }


        }

        return max;
    }
}