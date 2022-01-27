/*
283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/
class MoveZeroes {
    public void moveZeroes(int[] nums) {
        LinkedList<Integer> zerosList = new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zerosList.add(i);
            } else {
                if(zerosList.size() !=0){
                    nums[zerosList.pollFirst()] = nums[i];
                    nums[i]=0;
                    zerosList.add(i);
                    
                }
            }
        }
        return;
    }
}
