/*
25/2/2022: 144. Binary Tree Preorder Traversal

Given the root of a binary tree, return the preorder traversal of its nodes' values.
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
class PreOrderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root==null) return result;
        preorderTraversalHelper(root,result);
        return result;
    }
    public void preorderTraversalHelper(TreeNode root,List<Integer> result) {
        if(root==null) return;
        result.add(root.val);
        preorderTraversalHelper(root.left,result);
        preorderTraversalHelper(root.right,result);
    }
}
