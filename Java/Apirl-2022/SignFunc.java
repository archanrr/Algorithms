/*
14/4/2022 : 1822. Sign of the Product of an Array
There is a function signFunc(x) that returns:

1 if x is positive.
-1 if x is negative.
0 if x is equal to 0.
You are given an integer array nums. Let product be the product of all values in the array nums.

Return signFunc(product).

*/
class SignFunc {
    public int arraySign(int[] nums) {
        double prod=1;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
        }
        if(prod<0) return -1;
        else if(prod>0) return 1;
        else return 0;
    }
}
