package DynamicProgramming;

import java.util.HashMap;

public class CanTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Boolean> hmapMem = new HashMap<>();
		System.out.print(canSum(11,new int[]{34,10,2,9,1,4},hmapMem));
	}
	public static boolean canSum(int targetSum,int[] arr,HashMap<Integer,Boolean> hmapMem) {
		if(hmapMem.containsKey(targetSum)) return hmapMem.get(targetSum);
		if(targetSum == 0) return true;
		if(targetSum < 0) return false;
		for(int i=0;i<arr.length;i++) {
			int targetSum1 = targetSum - arr[i];
			boolean res = canSum(targetSum1,arr,hmapMem);
			hmapMem.put(targetSum1, res);
			if(res == true) {
				return true;
			}
		}
		return false;
	}

}
