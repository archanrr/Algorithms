import java.util.Arrays;

public class hasArrayTwoCandidates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(""+hasArrayTwoCandidates(new int[] {7,1,3,5,8,2},7));
	}
	public static boolean hasArrayTwoCandidates(int[] a,int sum) {
		Arrays.sort(a);
		int i=0;
		int j=a.length-1;
		for(;i<j;) {
			int temp = a[i]+a[j];
			if(temp==sum) {
				System.out.println("Number "+a[i]+" Number "+a[j]);
				return true;
			}
			else if(temp < sum) {
				i++;
			}
			else if(sum < temp) {
				j--;
			}
		}
		return false;
	}
}
