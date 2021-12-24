/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]
Output: true

Example 2:

Input: nums = [1,2,3,4]
Output: false

*/
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hm = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(hm.contains(nums[i])){
                return true;
            } else {
                hm.add(nums[i]);
            }
        }
        return false;
    }
}
