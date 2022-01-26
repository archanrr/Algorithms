/*
26/01/2022: Republic Day
1305. All Elements in Two Binary Search Trees

Given two binary search trees root1 and root2, return a list containing all the integers from both trees sorted in ascending order.

Input: root1 = [2,1,4], root2 = [1,0,3]
Output: [0,1,1,2,3,4]

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
class Sort2BinaryTree {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        /*List<Integer> newList = new ArrayList<Integer>(sortTree(root1));
        newList.addAll(sortTree(root2));
        Collections.sort(newList);
        return newList;*/
        return finalSort(sortTree(root1),sortTree(root2));
    }
    List<Integer> finalSort(List<Integer> list1,List<Integer> list2){
        List<Integer> finalList = new ArrayList<Integer>();
        int i=0,j=0;
        //System.out.print(" "+list1+" "+list2);
        while(i<list1.size() && j<list2.size()){
            //System.out.print(" "+list1.get(i)+" "+list2.get(j));
            if(list1.get(i)<list2.get(j)){
                finalList.add(list1.get(i));
                i++;
            } else if(list1.get(i)>list2.get(j)){
                finalList.add(list2.get(j));
                j++;
            } else {
                finalList.add(list1.get(i));
                i++;
                finalList.add(list2.get(j));
                j++;
            }
            
        }
        if(i!=list1.size()){
                while(i<list1.size()){
                    finalList.add(list1.get(i));
                    i++;
                }
            }
            if(j!=list2.size()){
                while(j<list2.size()){
                    finalList.add(list2.get(j));
                    j++;
                }
            }
        return finalList;
    }
    List<Integer> sortTree(TreeNode root){
        List<Integer> list = new ArrayList<Integer>();
        if(root==null) return list;
        inOrderTraversal(root,list);
        return list;
    }
    void inOrderTraversal(TreeNode root, List<Integer> list){
        if(root==null) return;
        inOrderTraversal(root.left,list);
        list.add(root.val);
        inOrderTraversal(root.right,list);
    }
}
