/*The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer num, return its complement

Example 1:

Input: num = 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

*/
class NumberComplement {
    public int findComplement(int num) {
         /* returns the string representation of the unsigned integer value 
         represented by the argument in binary (base 2) */
      //System.out.println("Binary = " + Integer.toBinaryString(i));

      // returns the number of one-bits 
      //System.out.println("Number of one bits = " + Integer.bitCount(i));

      /* returns an int value with at most a single one-bit, in the position 
         of the highest-order ("leftmost") one-bit in the specified int value */ 
     // System.out.println("Highest one bit = " + Integer.highestOneBit(i));
        
        
        return ~num & (Integer.highestOneBit(num) - 1);
    }
}
