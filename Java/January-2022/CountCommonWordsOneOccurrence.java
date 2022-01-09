/*
2085. Count Common Words With One Occurrence

Given two string arrays words1 and words2, return the number of strings that appear exactly once in each of the two arrays.
*/
class CountCommonWordsOneOccurrence {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> wordMap1 = new HashMap<String,Integer>();
        HashMap<String,Integer> wordMap2 = new HashMap<String,Integer>();
        for(String s: words1){
            if(wordMap1.containsKey(s)){
               wordMap1.put(s,-1);
            } else {
                wordMap1.put(s,1);
            }
        }
        for(String s: words2){
            if(wordMap2.containsKey(s)){
                wordMap2.put(s,-1);
            } else {
                wordMap2.put(s,1);
            }
        }
        int count = 0;
        for(String s : words1){
            if(wordMap1.containsKey(s) && wordMap2.containsKey(s)){
                if(wordMap1.get(s)==1 && wordMap2.get(s)==1) count++;
            }
        }
        return count;
    }
}
