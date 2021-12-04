//import DFS.BFS_class;

public class BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Node root = createNode(5);
	    insertNode(root,2);
	    insertNode(root,1);
	    insertNode(root,3);
	    insertNode(root,8);
	    insertNode(root,7);
	    insertNode(root,9);
	    insertNode(root,11);
	    insertNode(root,4);
	    insertNode(root,6);
	    insertNode(root,10);
	    insertNode(root,15);
	    insertNode(root,-1);
	    insertNode(root,-5);
	    insertNode(root,19);
	    GFG.print2D(root);
	    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	    ReverseBinaryTree reverseBST = new ReverseBinaryTree();
	    reverseBST.revBinYoutube(root);
	    GFG.print2D(root);
	    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	    reverseBST.reverseBinaryTree(root);
	    GFG.print2D(root);
	    //printLeafNode(root);
	    //DFS.BFS_fun(root);
	    //printTree(root);
	}
	static Node createNode(int data) {
		return new Node(data); 
	}
	public static void insertNode(Node root,int data) {
		//System.out.print(""+data);
		if(root == null) root = createNode(data);
		else if(root.left == null && root.data > data) root.left = createNode(data);
		else if(root.right == null && root.data < data) root.right = createNode(data);
		else if(root.data > data) insertNode(root.left,data);
		else if(root.data < data) insertNode(root.right,data);
		return;
	}
	public static void printTree(Node root) {
		if(root == null) return;
		//System.out.print("-->"+root.data+" ");
		printTree(root.left);
		System.out.print(""+root.data+"-->");
		printTree(root.right);
	}
	public static void printLeafNode(Node root) {
		if(root.left != null) printLeafNode(root.left);
		if(root.right != null) printLeafNode(root.right);
		if(root.left == null && root.right == null) System.out.print("->"+root.data);
	}

}
class Node {
	int data;
	Node left;
	Node right;
	Node(int value){
		this.data = value;
		this.left = null;
		this.right = null;
	}
}