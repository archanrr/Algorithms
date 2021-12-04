import java.util.Scanner;

public class RecursiveReverseStr {
	
	public static String reverseString(String s,StringBuffer sb) {
		if(s.length() == 0) return s;
		//System.out.print(s);
		String newStr = s.substring(1);
		char out = s.charAt(0);
		reverseString(s.substring(1),sb);
		sb.append(out);
		return sb.toString();
	}
	public static int countNumOfSpace(String str) {
		int count = 0;
		if(str.isEmpty())
			return 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ') count++;
		}
		return count;
	}
	public static String Optimizedreverse(String str) {
		if(str.length()==0) return str;
		return Optimizedreverse(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			String str = sc.nextLine();
			System.out.println(str.split("/")[0]);
			StringBuffer sb = new StringBuffer();
			System.out.println(reverseString(str,sb));
			System.out.print(Optimizedreverse(str)+" Space "+countNumOfSpace(str));
			
		}
		
	}

}
