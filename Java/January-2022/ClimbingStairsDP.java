/*
18/1/2022:

70. Climbing Stairs

You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/
class ClimbingStairsDP {
    public int climbStairs(int n) {
        if(n==1) return 1;
        int[] stepCountForEachStep = new int[n];
        stepCountForEachStep[0]=1;
        stepCountForEachStep[1]=2;
        if(n==2) return stepCountForEachStep[n-1];
        for(int i=2;i<n;i++){
            stepCountForEachStep[i]= stepCountForEachStep[i-1]+
                stepCountForEachStep[i-2];
        }
        return stepCountForEachStep[n-1];
    }
}
