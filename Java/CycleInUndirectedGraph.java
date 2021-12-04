
import java.util.*;
public class CycleInUndirectedGraph {

	static int findParent(int x,int[] arr) {
		if(arr[x] == -1) {
			return x;
		} else {
			return findParent(arr[x],arr);
		}
	}
	static void union_op(int[] arr,int a ,int b) {
		int from = findParent(a,arr);
		int to = findParent(b,arr);
		System.out.println(from+" to "+to);
		arr[from] =to;
	}
	static boolean isCycle(int[][] input, int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++)
			{
				if(input[i][j]!=-1) {
					int a = findParent(i,arr);
					int b = findParent(j,arr);
					System.out.println("i= "+i+" j= "+j);
					if(a==b) {
						return true;
					}
					union_op(arr,a,b);
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int V = sc.nextInt();
		int E = sc.nextInt();
		int[][] input = new int[V][V];
		for(int i=0;i<V;i++) {
			for(int j=0;j<V;j++) {
				input[i][j]=-1;
			}
		}
		for(int i=0;i<E;i++) {
			int j = sc.nextInt();
			int k = sc.nextInt();
			input[j][k]=sc.nextInt();
			
		}
		int[] arr = new int[V];
		for(int i=0;i<V;i++) {
			arr[i] = -1;
		}
		System.out.println(isCycle(input,arr));
		for(int i=0;i<V;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
