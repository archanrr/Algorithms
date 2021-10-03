import java.util.*;
public class rangeSortedArray {

	static int SearchFirstPos(int[] arr,int X) {
		int n = arr.length;
		int high= n-1;
		int low = 0;
		int mid=0;
		while(low<=high) {
			mid=(low + high)/2;
			if(arr[mid] <= X) {
				low = mid+1;
			} else {
				high = mid;
			}
		}
		return mid;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		System.out.println(SearchFirstPos(arr,X));
		System.out.println(SearchFirstPos(arr,X-1));
		
	}

}
