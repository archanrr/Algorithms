
public class TEST_apisero_2 {

	public static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(count < 3) {
			count++;
			System.out.println(""+count+args);
			main(null);
		}
		else {
			return;
		}
		System.out.println("Hello World");
	}

}
