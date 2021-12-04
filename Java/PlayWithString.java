import java.util.Arrays;

public class PlayWithString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a sample test program";
		String str1 = "-ASWIN";
		char[] st = str.toCharArray();
		//str = (String)st.va;
		//str.charAt(6);
		str = str.toLowerCase();
		System.out.println(str.substring(0,6)+" -> "+str.substring(3));
		int x = 12;
		//System.out.println(Math.addExact(1, 2));
		int[] a = new int[]{2,1,4,0,5};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) System.out.println(a[i]);
		
		
	}

}
