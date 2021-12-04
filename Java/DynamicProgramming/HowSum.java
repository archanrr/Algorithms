package DynamicProgramming;

import java.util.ArrayList;

public class HowSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<Integer,ArrayList<Integer>> hmapMem = new HashMap<>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		System.out.print(howSum(15,new int[]{2,3}));
	}
	public static ArrayList<Integer> howSum(int targetSum,int[] arr) {
		if(targetSum == 0) {
			return new ArrayList<Integer>();
		}
		if(targetSum < 0) return null;
		for(int i=0;i<arr.length;i++) {
			int targetSum1 = targetSum - arr[i];
			ArrayList<Integer> res = howSum(targetSum1,arr);
			//System.out.println(res);
			if(res != null) {
				res.add(arr[i]);
				return res;
			}
		}
		return null;
	}

}
