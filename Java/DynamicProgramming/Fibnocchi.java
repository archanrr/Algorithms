package DynamicProgramming;

import java.util.*;

public class Fibnocchi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Long> memo = new HashMap<Integer,Long>();
		System.out.print(fib(5000,memo));
	}
	public static long fib(int n,HashMap<Integer, Long> memo) {
		if(memo.containsKey(n)) return memo.get(n);
		if(n <= 2) return 1;
		long res = fib(n-1,memo) + fib(n-2,memo);
		memo.put(n,res);
		return res;
	}

}
