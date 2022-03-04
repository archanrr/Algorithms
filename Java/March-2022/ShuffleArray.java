/*
4/3/2022 : 1470. Shuffle the Array

Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].
*/
class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];
        for(int i = 0,j=n,z=0;i < n && z<2*n;i++,j++){
            result[z] = nums[i];
            result[++z]=nums[j];
            z++;
        }
        return result;
    }
}
