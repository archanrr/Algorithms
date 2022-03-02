/*
2/3/2022 : 2011. Final Value of Variable After Performing Operations
There is a programming language with only four operations and one variable X:

++X and X++ increments the value of the variable X by 1.
--X and X-- decrements the value of the variable X by 1.
Initially, the value of X is 0.

Given an array of strings operations containing a list of operations, return the final value of X after performing all the operations.
*/
class FinalVariable {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for(String str : operations){
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='+' && str.charAt(0)=='X') {
                    result++;
                    break;
                } else if(str.charAt(i)=='+' && str.charAt(2)=='X') {
                    ++result;
                    break;
                } else if(str.charAt(i)=='-' && str.charAt(0)=='X') {
                    result--;
                    break;
                } else if(str.charAt(i)=='-' && str.charAt(2)=='X') {
                    --result;
                    break;
                } 
            }
        }
        return result;
    }
}
