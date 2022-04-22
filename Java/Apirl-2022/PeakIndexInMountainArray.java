/*
22/4/2022 : 852. Peak Index in a Mountain Array [Earth day -Pavi Birthday]
Let's call an array arr a mountain if the following properties hold:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... arr[i-1] < arr[i]
arr[i] > arr[i+1] > ... > arr[arr.length - 1]
Given an integer array arr that is guaranteed to be a mountain, return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
*/
class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0 , j = arr.length;
        while(i<=j) // By Using Binary Search
        {
            int mid=(i+j)/2;
            if(arr[mid]<arr[mid+1]) // If mid index element is smaller than mid+1 index element then required index will be on the right of mid.
            i=mid+1;
            else    // else the required element will be on the left.
            j=mid-1;
        }
        return i;
    }
}
