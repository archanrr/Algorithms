/*
2119. A Number After a Double Reversal

Reversing an integer means to reverse all its digits.

For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. Return true if reversed2 equals num. Otherwise return false.
*/
class Solution {
    public boolean isSameAfterReversals(int num) {
        int res = reverseNumber(reverseNumber(num));
        if(res==num) return true;
        return false;
    }
    int reverseNumber(int num){
        int temp = num;
        int res = 0;
        while(temp!=0){
            res = res*10 + temp%10;
            temp = temp/10;
        }
        return res;
    }
}
/*
Alternate Solution:

if(num%10!=0) return true;
else return false;
*/
