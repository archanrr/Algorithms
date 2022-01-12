/*
242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.
*/
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] mapper = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i=0;i<s.length();i++){
            mapper[s.charAt(i)-'a']=++mapper[s.charAt(i)-'a'];
        }
        for(int i=0;i<t.length();i++){
             mapper[t.charAt(i)-'a']=--mapper[t.charAt(i)-'a'];
        }
        for(int i=0;i<mapper.length;i++){
            if(mapper[i]!=0){
                return false;
            }
        }
        return true;
    }
}
