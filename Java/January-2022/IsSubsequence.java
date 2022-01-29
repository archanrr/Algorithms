/*
29/1/2022: 392. Is Subsequence
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
*/
class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        if(s.length()>=t.length()) return false;
        LinkedList<Character> list = new LinkedList<>();
        for(int i=0;i<s.length();i++){
            list.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
            if(list.size() == 0) break;
            if(t.charAt(i) == list.getFirst()){
                list.poll();
            }
        }
        if(list.size() != 0) return false;
        return true;
    }
}
