/*
66. Plus One

You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
*/
class PlusOne {
    public int[] plusOne(int[] digits) {
        int count = 0;
        int remainder = 0;
        int x=0;
        for(int i=digits.length-1;i>=0;i--){
            if(i==digits.length-1) x=1;
            else x=0;
            remainder = (digits[digits.length-i-1]+x+remainder)/10;
            digits[digits.length-i-1] = (digits[digits.length-i-1]+x+remainder)%10;
            count++;
            System.out.print(" "+digits[i]);
        }
        x  = 0;
        if(remainder>0) {
            count++;
            x = 1;
        }
        int[] result = new int[count];
        for(int i=digits.length+x-1;i>=0;i--){
            System.out.print(i+" "+" x = "+x+" "+digits[i-x]);
           result[i]=digits[i-x];
        }
        return result;
    }
}
