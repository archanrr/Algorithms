/*
find the pallindrome of given number including negative numbers.
*/
class PalindromeNumber_Including_Negative {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        else {
            int temp = x;
            int res = 0;
            while(temp != 0){
                res = res*10 + temp%10;
                temp = temp/10;
            }
            System.out.print(res);
            if(x==res) return true;
        }
        return false;
    }
}
