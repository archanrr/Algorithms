/*
2108. Find First Palindromic String in the Array

Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.
    */
class FirstPallindromeWord {
    public String firstPalindrome(String[] words) {
        for(String str : words){
            if(checkPalindrome(str)){
                return str;
            }
        }
        return "";
    }
    boolean checkPalindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
