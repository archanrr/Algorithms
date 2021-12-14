/*
Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
*/
class Search_Insert_Position {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        if(nums[h]<target) return h+1;
        if(nums[l]>target) return 0;
        while(l<=h){
            int mid = l + (h-l)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                l++;
            } else {
                h--;
            }
        }
       return l; 
    }
}
