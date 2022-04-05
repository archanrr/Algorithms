/*
5/4/2022 : 1523. Count Odd Numbers in an Interval Range [4 carp bought]

Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).
*/
class CountOddNosInInterval {
    public int countOdds(int low, int high) {
        /*int count = 0;
        if(low%2==0) low++;
        for(int i=low;i<=high;i+=2){
            count++;
        }
        return count;*/
        if (low%2==0&&high%2==0) {
            return (high-low)/2;
        } else {
            return (high-low)/2+1;
        }
    }
}
