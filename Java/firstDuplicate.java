import java.util.HashSet;

public class firstDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Good soln"+firstduplicate(new int[] {1,2,3,2,1}));
		System.out.println("More Optimized"+firstduplicateGoogle(new int[] {1,2,3,2,1}));

	}
	public static int firstduplicate(int[] arr) {
		HashSet<Integer> seen = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(seen.contains(arr[i])) return arr[i];
			seen.add(arr[i]);
		}
		return -1;
	}
	// Indexing each integer in array as each number
	public static int firstduplicateGoogle(int[] a) {
		for(int i=0;i<a.length;i++) {
			if(a[Math.abs(a[i]-1)] > 0) a[a[i]-1] = -a[a[i]-1];
			else if(a[Math.abs(a[i]-1)] < 0){
				return Math.abs(a[i]);
			}
		}
		return -1;
	}

}
