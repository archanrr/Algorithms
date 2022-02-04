/*
4/2/2022: 258. Add Digits
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
*/
class AddDigits {
    public int addDigits(int num) {
        /*int res = num;
        while(res/10 !=0){
            int res1 = res;
            res = 0;
            while(res1 !=0){
                res+=res1%10;
                System.out.println(" "+res);
                res1 = res1/10;
            }
            
        }
        return res;*/
        if(num==0)
           return 0;
        if(num%9==0)
            return 9;
        else
            return num%9;
    }
}
