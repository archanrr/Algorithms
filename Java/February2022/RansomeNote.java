/*

24/2/2022 : 383. Ransom Note -Ukraine-Russia War

Given two strings ransomNote and magazine, return true if ransomNote can be constructed from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.

*/
class RansomeNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> hmap = new HashMap<>();
        for(char ch : magazine.toCharArray()){
            if(hmap.containsKey(ch)){
                hmap.put(ch,hmap.get(ch)+1);
            } else {
                hmap.put(ch,1);
            }
        }
         for(char ch : ransomNote.toCharArray()){
            if(hmap.containsKey(ch)){
                if(hmap.get(ch)<=0) return false;
                else hmap.put(ch,hmap.get(ch)-1);
            } else return false;
        }
        return true;
    }
}
