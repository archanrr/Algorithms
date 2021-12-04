package CodeForces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        char[] arr = name.toCharArray();
        for(char i:arr) {
        	System.out.print((int)i+" ");
        }
	}

}
