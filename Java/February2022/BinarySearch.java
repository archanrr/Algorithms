/*
9/1/2022: 704. Binary Search

Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.
*/
class BinarySearch {
    public int search(int[] nums, int target) {
        int i=0,j=nums.length-1;
        while(i<=j){
            int mid = i + (j-i)/2;
            if(nums[mid]==target){
                return mid;
            } else if(nums[mid]<target) {
                i = mid+1;
            } else {
                j = mid-1;
            }
        }
        return -1;
    }
}
