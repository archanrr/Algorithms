/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

Input: root = [2,1,3]
Output: true
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
class isValidBSTClass {
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        bstHelper(root,list);
        System.out.print(list);
        for (int i = 0; i < list.size()-1; i++) {
            if(list.get(i) >= list.get(i+1)){
                return false;
            }
        }
        return true;
        
    }
    public void bstHelper(TreeNode root,List<Integer> list){
        if(root==null) return;
        bstHelper(root.left,list);
        list.add(root.val);
        bstHelper(root.right,list);
        
    }
}
