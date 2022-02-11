/*
11/2/2022: 977. Squares of a Sorted Array

Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

*/
class SquaresSortedArray {
    public int[] sortedSquares(int[] nums) 
    {
        int n=nums.length,i=0,j,x=0;
        int a[] = new int[n];     
        while(i<n && nums[i]<0)
            i++;
        j=i-1;
        while(j>=0 && i<n)
        {
            if(nums[i] < -nums[j])
                a[x++]=nums[i]*nums[i++];
            else
                a[x++]=nums[j]*nums[j--];
        }
        while(j>=0)
            a[x++]=nums[j]*nums[j--];
        while(i<n)
            a[x++]=nums[i]*nums[i++];
        return a;
    }
}
