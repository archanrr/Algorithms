/*
28/02/2022 : 228. Summary Ranges

You are given a sorted unique integer array nums.

Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
*/
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        
        
        for(int i=0;i<nums.length;i++)
        {
            int start=nums[i];
            while(i+1<nums.length && nums[i]+1 == nums[i+1])
            {
                i++;
            }
            
            //This ensures that in our range there is more than one element.
            if(start!=nums[i])
            {
                ans.add("" + start + "->"+nums[i]);  
            }
            else
            {
                ans.add(""+start);
            }
        }
        return ans;
    }
}
