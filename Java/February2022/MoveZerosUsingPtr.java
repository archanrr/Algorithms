/*
13/2/2022: 283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/
class MoveZerosUsingPtr {
    public void moveZeroes(int[] nums) {
        int zeroCount=0;
        int ptr=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroCount++;
            } else {
                nums[ptr]=nums[i];
                ptr++;
            }
        }
        for(int i=ptr;i<nums.length;i++){
            nums[i]=0;
        }
        return;
    }
}
