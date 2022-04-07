/*
7/4/2022 : 191. Number of 1 Bits
Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

Note:

Note that in some languages, such as Java, there is no unsigned integer type. In this case, the input will be given as a signed integer type. It should not affect your implementation, as the integer's internal binary representation is the same, whether it is signed or unsigned.
In Java, the compiler represents the signed integers using 2's complement notation. Therefore, in Example 3, the input represents the signed integer. -3.
*/
public class CountNoOf1s {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        /*int s=0,c=0;
        while(c!=32){
          s+=((n&1)==1)?1:0;
          n>>=1; // Shift by bit
          c++;
        }
        return s;*/
        int count = 0;
        String s = Integer.toBinaryString(n);
        
        for( int i = 0 ;i<s.length(); i++ ){
            char c = s.charAt(i);
            if(c == '1'){
                count++;
            }
        }
        
        return count;
    }
}
