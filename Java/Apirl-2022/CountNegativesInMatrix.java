/*
30/4/2022 - 1351. Count Negative Numbers in a Sorted Matrix

Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise, return the number of negative numbers in grid.
*/
class CountNegativesInMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=grid[i].length-1;j>=0;j--){
                if(grid[i][j]<0){
                    count++;
                } else break;
            }
        }
        return count;
    }
}
