package CodeForces;
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/
//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class Contest1 {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

         */ 
         //Scanner
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int y = s.nextInt();                 // Reading input from STDIN
        //System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i]= s.nextInt();
        System.out.println("n "+n+" x "+x+" y "+y);
        HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 0;
        int max = 0;
        int lenZero = 0;
        // Write your code here
        for(int i=0;i<n;i++){
            if(arr[i]>0) arr[i] = arr[i]-x;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
                hm.put(arr[i],count);
                lenZero++;
            }
            if(lenZero>max) max=lenZero;
            lenZero = 0;
        }
        System.out.println(lenZero+count);
    }
}
