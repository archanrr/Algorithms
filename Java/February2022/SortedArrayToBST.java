/*
27/2/2022: 108. Convert Sorted Array to Binary Search Tree

Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.

A height-balanced binary tree is a binary tree in which the depth of the two subtrees of every node never differs by more than one.
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
class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
        return null;
    
    TreeNode root = implement( 0, nums.length-1,nums);
    return root;
    
}

public TreeNode implement( int low, int high, int[] nums)
{
    if(low > high)
        return null;
    
    int mid = (low + high)/2;        
    TreeNode root = new TreeNode(nums[mid]);
    root.left = implement( low, mid-1,nums);
    root.right = implement(mid+1, high,nums);    
    return root;
    
}
}
