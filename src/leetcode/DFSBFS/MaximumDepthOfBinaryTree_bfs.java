package leetcode.DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthOfBinaryTree_bfs {
    public static void main(String[] args) {
        TreeNode tree = new TreeNode(3);
        tree.left = new TreeNode(1);
        tree.right = new TreeNode(4);
        tree.left.left = new TreeNode(5);
        tree.left.right = new TreeNode(8);
        tree.left.left.left = new TreeNode(7);
        System.out.println(bfs(tree));

    }

    public static int bfs(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count =0;
        while(!queue.isEmpty()){
            int size =queue.size();
            for(int i=0; i<size; i++){
                TreeNode node = queue.poll();
                if(node.right != null) {
                    queue.add(node.right);
                }
                if(node.left != null) {
                    queue.add(node.left);
                }
            }
            count++;
        }
        return count;

    }

}
