/*
21/1/2022->1:21pm


1995. Count Special Quadruplets

Given a 0-indexed integer array nums, return the number of distinct quadruplets (a, b, c, d) such that:

nums[a] + nums[b] + nums[c] == nums[d], and
a < b < c < d

*/
class countQuadruplets {
    public int countQuadruplets(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n-3;i++)
        {
            for(int j=i+1;j<n-2;j++)
            {
                for(int k=j+1;k<n-1;k++)
                {
                    for(int l=k+1;l<n;l++)
                    {
                        if(nums[i]+nums[j]+nums[k]==nums[l])
                            count++;
                    }
                }
            }
        }
        return count; 
    }
}
