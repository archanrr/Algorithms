/*
14/2/2022: Valentines Day: 167. Two Sum II - Input Array Is Sorted

Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.
*/
class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length -1;
        while(low <= high){
            if( numbers[low] + numbers[high] == target){
                return new int[] {low+1, high+1};
            }
            else if( numbers[low] + numbers[high] < target){
                low++;
            }
            else{
                high--;
            }
        }
        
        return new int[] {};
    }
}
