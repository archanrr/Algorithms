/*
6/4/2022 : 1491. Average Salary Excluding the Minimum and Maximum Salary

You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.
*/
class AvgSalaryExclMinMax {
    public double average(int[] salary) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int res = 0;
        for(int i=0;i<salary.length;i++){
            if(min>salary[i]) min = salary[i];
            if(max<salary[i]) max = salary[i];
            res+=salary[i];
        }
        return (double)(res-min-max)/(salary.length-2);
    }
}
