package CodeForces;

import java.util.*;

public class Countdown {

	public static int countToZeroOperation(int[] arr, int n) {
		int countNotZero = 0;
		int res = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]>0) {
				countNotZero++;
				res+=arr[i];
			}
		}
		if(arr[n-1]==0) 
			return res+countNotZero;
		return res+countNotZero-1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no_testcases = sc.nextInt();
		while(no_testcases != 0 ) {
			no_testcases--;
			int n = sc.nextInt();
			String str = sc.next();
			//System.out.println(str);
			
			char[] arr = str.toCharArray();
			int[] arr1 = new int[n];
			for(int i=0;i<n;i++) {
				arr1[i]=arr[i]-'1'+1;
				//System.out.print(arr[i]);
			}
			System.out.println(countToZeroOperation(arr1,n));
		}

	}

}
