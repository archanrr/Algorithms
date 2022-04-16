/*
16/4/2022 : 589. N-ary Tree Preorder Traversal
Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value
*/
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class M-ary_Preorder {
    public List<Integer> preorder(Node root) {
        return helper(root, new ArrayList<Integer>());
    }
    private List<Integer> helper(Node root, List<Integer> results) {
        if(root == null) {
            return results;
        }
        
        results.add(root.val);
        for(Node node : root.children)
            helper(node, results);
        
        return results;
    }
}
