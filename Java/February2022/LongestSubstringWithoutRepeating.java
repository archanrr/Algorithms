/*
19/2/2022: 3. Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without repeating characters.
*/
class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")) return 0;
        if(s== null) return 0;
        HashSet<Character> characterSet = new HashSet<>();
        int count = 0;
        characterSet.add(s.charAt(0));
        for(int i=1,j=0;i<s.length();){
            if(!characterSet.contains(s.charAt(i))){
                characterSet.add(s.charAt(i));
                i++;
            } else {
                j++;
                i=j;
                if(count < characterSet.size()) count=characterSet.size();
                characterSet.clear();
                characterSet.add(s.charAt(i));
                i++;
            }
        }
        if(count < characterSet.size()) count=characterSet.size();
        return count;
    }
}
