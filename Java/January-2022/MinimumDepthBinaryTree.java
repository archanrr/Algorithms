/*
111. Minimum Depth of Binary Tree

Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class MinimumDepthBinaryTree {
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        if(root.right==null&&root.left==null) return 1;
        return findMinimun(root);
    }
    int findMinimun(TreeNode root){
        if(root == null){
            return 0;
        }
        if(root.right==null&&root.left!=null) return 1 + findMinimun(root.left); 
        if(root.left==null&&root.right!=null) return 1 + findMinimun(root.right);
        return 1+Math.min(findMinimun(root.left),findMinimun(root.right));
    }
}
