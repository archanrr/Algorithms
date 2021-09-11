import java.util.HashMap;

public class LRU {

	public static Node LRU;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRU = new Node(0,null,null);
		HashMap<Integer,Node> hm = new HashMap<Integer,Node>();
		Node.insert(hm,new Node(5,null,null));
	}

}
class Node {
	int data;
	Node left;
	Node right;
	Node(int data,Node left,Node right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	public static void insert(HashMap<Integer,Node> hm,Node node) {
		if (hm.containsKey(node)) {
			
		} else {
			hm.put(null, node);
		}
	}
}
