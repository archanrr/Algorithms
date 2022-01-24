/*
24/1/2022:

520. Detect Capital

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.

Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false

*/
class DetectCapitalUse {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int no_of_capital = 0;
        if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'){
            no_of_capital++;
        }
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i) <= 'Z'){
                if(no_of_capital==0) return false;
                else no_of_capital++;
            }
        }
        if(no_of_capital<=1) return true;
        else if(no_of_capital!=n) return false;
        
        return true;
    }
}
