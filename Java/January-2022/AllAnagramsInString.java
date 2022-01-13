/*
13/1/022:

438. Find All Anagrams in a String

Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Input: s = "cbaebabacd", p = "abc"
Output: [0,6]
Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".

*/
class AllAnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<=s.length()-p.length();i++){
            if(isAnagram(s.substring(i,i+p.length()),p)){
                list.add(i);
            }
        }
        return list;
    }
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
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
