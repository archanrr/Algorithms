/*
8/4/2022 : 1281. Subtract the Product and Sum of Digits of an Integer

Given an integer number n, return the difference between the product of its digits and the sum of its digits.
*/
class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        int sum=0,prod=1;
        while(n!=0){
            sum+=n%10;
            prod*=n%10;
            n=n/10;
        }
        return (prod-sum);
    }
}
