/*
25/4/2022 : 367. Valid Perfect Square

Given a positive integer num, write a function which returns True if num is a perfect square else False.

Follow up: Do not use any built-in library function such as sqrt.
*/
class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        int l = 1;
        int r = num;
        int mid;
        while(l <= r){
            mid = l + (r - l) / 2;
            if(mid * mid > num){
                r = mid - 1;
            }
            else if(mid * mid < num){
                l = mid + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
