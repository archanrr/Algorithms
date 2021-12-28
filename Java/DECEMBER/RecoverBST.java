/*
99. Recover Binary Search Tree

You are given the root of a binary search tree (BST), where the values of exactly two nodes of the tree were swapped by mistake. Recover the tree without changing its structure.

Input: root = [1,3,null,null,2]
Output: [3,1,null,null,2]
Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid.

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
class RecoverBST {
    public void recoverTree(TreeNode root) {
        List<TreeNode> list = new ArrayList<TreeNode>();
        bstHelper(root,list);
        TreeNode swapNode1 = null;
        TreeNode swapNode2 = null;
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i).val>list.get(i+1).val){
                swapNode2 = list.get(i+1);
                if(swapNode1 == null) swapNode1 = list.get(i);
                else break;
            }
        }
        int temp = swapNode2.val;
        swapNode2.val = swapNode1.val;
        swapNode1.val = temp;
        
    }
    public void bstHelper(TreeNode root,List<TreeNode> list){
        if(root==null) return;
        bstHelper(root.left,list);
        list.add(root);
        bstHelper(root.right,list);
        
    }
}
