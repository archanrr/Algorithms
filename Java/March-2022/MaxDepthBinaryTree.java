/*
15 March 2022 : 104. Maximum Depth of Binary Tree
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
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
class MaxDepthBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null){
		    return 0;
	    }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
    
        int max = Math.max(left, right)+1;
    
        return max;
    }
}
