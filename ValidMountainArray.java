/*
25/1/2022

941. Valid Mountain Array

Given an array of integers arr, return true if and only if it is a valid mountain array.

Recall that arr is a mountain array if and only if:

arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
*/
class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length < 3) return false;
		
        int n = A.length, L = 0, R = n-1;
        while(L < n-1) {
            if(A[L] < A[L+1]) L++;
            else break;
        }
        
        if(L == n-1) return false; // only strictly increasing -> 0 1 2 5 6 8 9
        
        while(R > 0) {
            if(A[R] < A[R-1]) R--;
            else break;
        }
        
        if(R == 0) return false; // only strictly decreasing -> 9 6 5 3 2 1 0
        
        return L == R;
    }
}
