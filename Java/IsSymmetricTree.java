/*
16/3/2022 : 101. Symmetric Tree EXPO 2022 - 3rd Day - [Australia,Russia,Republic of Korea,Serbia,Norway]

Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
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
class IsSymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return false;
        } else if (root.right == null && root.left == null) {
            return true;
        } else {
            return isSymmetricUtil(root.left, root.right);
        }
    }

    public boolean isSymmetricUtil(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        } else {
            return (isSymmetricUtil(p.left, q.right) && isSymmetricUtil(p.right, q.left));
        }
    }
}
