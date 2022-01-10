/*
2133. Check if Every Row and Column Contains All Numbers

An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).

Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.
*/
class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        boolean[] isNumPresnt = new boolean[n];
        for(int i=0;i<n;i++){
            isNumPresnt[i]=false;
        }
        //HashSet<Integer> isNumPresnt = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //isNumPresnt.add(matrix[i][j]);
                isNumPresnt[matrix[i][j]-1]=true;
            }
            for(int k=0;k<n;k++){
                if(!isNumPresnt[k]){
                    return false;
                } else {
                    isNumPresnt[k]=false;
                }
            }
        }
        boolean[] isNumPresnt1 = new boolean[n];
        for(int i=0;i<n;i++){
            isNumPresnt[i]=false;
        }
        //HashSet<Integer> isNumPresnt = new HashSet<Integer>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //isNumPresnt.add(matrix[i][j]);
                isNumPresnt1[matrix[j][i]-1]=true;
            }
            for(int k=0;k<n;k++){
                if(!isNumPresnt1[k]){
                    return false;
                } else {
                    isNumPresnt1[k]=false;
                }
            }
        }
        return true;
    }
}
