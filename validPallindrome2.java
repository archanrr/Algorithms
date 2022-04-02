/*

2/4/2022 : 680. Valid Palindrome II

Given a string s, return true if the s can be palindrome after deleting at most one character from it.
*/
class validPallindrome2 {
    public boolean validPalindrome(String s) {
        return isPalindrome(s, 0, s.length()-1, 1);
    }
   public boolean isPalindrome(String str, int start, int end, int chance) {
        if(start >= end) return true;
        if(str.charAt(start) == str.charAt(end))
            return isPalindrome(str, start+1, end-1, chance);
        
        if(chance == 0) return false;
        
    return isPalindrome(str, start+1, end, chance-1)  || isPalindrome(str, start, end - 1,chance-1);
    }
}
