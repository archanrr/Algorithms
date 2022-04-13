/*
13/4/2022 : 976. Largest Perimeter Triangle

Given an integer array nums, return the largest perimeter of a triangle with a non-zero area, formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.
*/
class Solution {
    public int largestPerimeter(int[] nums) {
        int p=0;
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=2; i--){
            if(nums[i] < nums[i-1]+nums[i-2]){
                int pe = nums[i]+nums[i-1]+nums[i-2];
                if(pe > p) p=pe;
            }
        }
        return p;
    }
}
