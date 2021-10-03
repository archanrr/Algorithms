import java.util.*;

public class DFS {

	public static class BFS_class{
		BFS_class(){
			
		}
		static int BFS_fun(int[][] table,int n) {
			Deque<Integer> list = new LinkedList<Integer>();
			for(int i=0;i<n;) {
				System.out.print(i+1);
				for(int j=i+1;j<n;j++) {
					if(table[i][j] == 1 && !list.contains(j)) list.add(j); 
				}
				if(list.isEmpty()) break;
				i = list.pop();
				//System.out.print(i+1);
			}
			return 1;
		}
	}
	public static void BFS_fun(Node root){
		final Deque<Node> list = new LinkedList<Node>();

		list.add(root);
		if(root.left != null) list.add(root.left);
		if(root.right != null) list.add(root.right);
		System.out.print(root.data+"  ");
		while(true) {
			list.removeFirst();
			if(list.isEmpty()) break;
			BFS_fun(list.peek());
		}
		return;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BFS_class dc= new BFS_class();
		Scanner sc = new Scanner(System.in);
		int no_of_nodes = sc.nextInt();
		int[][] arr = new int[no_of_nodes][no_of_nodes];
		for(int i=0;i<no_of_nodes;i++) {
			for(int j=0;j<no_of_nodes;j++) {
				System.out.println("Is there a node b/w "+(i+1)+" and "+(j+1)+"? 1 or 0");
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		BFS_class.BFS_fun(arr,no_of_nodes);

	}

}
