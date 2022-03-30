/*
30/3/2022 : 74. Search a 2D Matrix [file income tax return ay 2021-22 technicolor]
Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
*/
class Searcg2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0, j = matrix[0].length - 1;
        while(i < matrix.length && j >= 0) {
            if(matrix[i][j] == target)
                return true;
            else if(matrix[i][j] > target)
                j --;
            else if(matrix[i][j] < target)
                i ++;
        }
      return false;
    }
}
/*
class Searcg2dMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][0]==target || matrix[i][matrix[i].length-1]==target)   return true;
            else if(matrix[i][0]>target) searchRow(matrix,i-1,target);
            else if(matrix[i][matrix[i].length]>target) searchRow(matrix,i+1,target);
            else searchRow(matrix,i,target);
        }
        return searchRow(matrix,0,target);
    }
    public boolean searchRow(int[][] matrix,int pos,int target){
        if(matrix[pos][0]==target || matrix[pos][matrix[pos].length-1]==target) return true;
        for(int i=1;i<matrix[pos].length/2;i++){
            if(matrix[pos][i]==target || matrix[pos][matrix[pos].length-i-1]==target)   return true;
        }
        return false;
    }
}
*/
