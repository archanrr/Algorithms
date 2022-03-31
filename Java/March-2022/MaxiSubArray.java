/*
31/3/2022 : 53. Maximum Subarray

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

A subarray is a contiguous part of an array.
*/
class MaxiSubArray {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE, s=0;
        for (int i : nums){
            s = s+i;
            if (s>maxsum)
                maxsum=s;
            if (s<0){
                s = 0;
            }
        }
        return maxsum;
    }
}
