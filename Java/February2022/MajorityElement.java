/*
21/2/2022 : 169. Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
*/
class MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums.length == 1) return nums[0];
        HashMap<Integer,Integer> mapper = new HashMap<>();
        int max=0,idx=nums[0];
        for(int i : nums){
            if(mapper.containsKey(i)){
                int c = mapper.get(i)+1;
                if(c > max){
                    max = c;
                    idx = i;
                }
                mapper.put(i,c);
            } else mapper.put(i,1);
        }
        return idx;
    }
}
