/*

290. Word Pattern

Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
*/
class WordPattern {
    public boolean wordPattern(String pattern, String s) {
       Map<Character, String> charMap = new HashMap<>();
       Map<String, Character> wordMap = new HashMap<>();
        String[] words = s.split(" ");
        if (pattern.length() != words.length)
            return false;
        int i = 0;
        while (i < words.length){
            char c = pattern.charAt(i);
            String word = words[i++];
            if (!charMap.containsKey(c) && !wordMap.containsKey(word)){
                charMap.put(c, word);
                wordMap.put(word,c);
            }else if (charMap.containsKey(c) && !word.equals(charMap.get(c)))
                return false;
            else if(wordMap.containsKey(word) && c != wordMap.get(word))
                return false;
        }
        return true;
        
    }
}
