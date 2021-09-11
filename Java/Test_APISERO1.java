
public class Test_APISERO1 {

	public static void main(String[] args) { 
		int count = 0; 
		int a = 3; 
		while(count++ <3) { 
			System.out.println(count); 
			int b = (1+ 2*count)%3; 
			System.out.println("b "+b);
			switch(b) { 
			default: 
				case 0: a-=1; break; 
				case 1: a+=5; 
			} 
			System.out.println("a "+a);
		} 
		System.out.println(a); 
		} 
}
