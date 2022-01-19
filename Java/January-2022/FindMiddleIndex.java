/*
20/1/2022:->

1991. Find the Middle Index in Array

Given a 0-indexed integer array nums, find the leftmost middleIndex (i.e., the smallest amongst all the possible ones).

A middleIndex is an index where nums[0] + nums[1] + ... + nums[middleIndex-1] == nums[middleIndex+1] + nums[middleIndex+2] + ... + nums[nums.length-1].

If middleIndex == 0, the left side sum is considered to be 0. Similarly, if middleIndex == nums.length - 1, the right side sum is considered to be 0.

Return the leftmost middleIndex that satisfies the condition, or -1 if there is no such index.
*/
class FindMiddleIndex {
    public int findMiddleIndex(int[] nums) {
        if(nums.length <=1) return 0;
        int[] sumArr = new int[nums.length];
        int left = 0;
        for(int i=1;i<nums.length;i++){
            sumArr[0]+=nums[i];
        }
        if(left==sumArr[0]){
            return 0;
        }
        System.out.println("left "+left+"sumArr "+sumArr[0]);
        for(int i=1;i<nums.length;i++){
            left +=nums[i-1];
            sumArr[i]=sumArr[i-1]-nums[i];
            System.out.println("left "+left+"sumArr "+sumArr[i]);
            if(left==sumArr[i]){
                return i;
            }
        }
        return -1;
    }
}
