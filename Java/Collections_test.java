import java.util.*;

public class Collections_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Character> q = new LinkedList<Character>();
		for(int i=10;i>=0;i--) {
			q.add((char) ('A'+i));
		}
		System.out.println(q);
		Deque<Character> q1 = new ArrayDeque<Character>();
		for(int i=10;i>=0;i--) {
			q1.add((char) ('A'+i));
		}
		System.out.println("Before Doing any Operation	"+q1.hashCode());
		System.out.println(q1.containsAll(q));
		Iterator<Character> it = q1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("After Performing any operation	"+q1);

	}

}
