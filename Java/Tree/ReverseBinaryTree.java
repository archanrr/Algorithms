
public class ReverseBinaryTree {
	void reverseBinaryTree(Node root) {
		if(root == null) {
			return;
		}
		reverseBinaryTree(root.left);
		reverseBinaryTree(root.right);
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		return;
	}
	void revBinYoutube(Node root) {
		if(root == null) {
			return;
		}
		Node temp = root.left;
		root.left = root.right;
		root.right = temp;
		reverseBinaryTree(root.left);
		reverseBinaryTree(root.right);
		return;
	}
}
