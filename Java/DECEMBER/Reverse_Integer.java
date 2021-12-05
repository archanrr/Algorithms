/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321

*/
class Reverse_Integer {
    public int reverse(int x) {
        long ans = 0;
        while(x!=0){
            ans = ans*10 + x%10;
            x = x/10;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE) return 0;
        return (int)ans;
    }
}
