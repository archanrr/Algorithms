/*
4/2/2022:387. First Unique Character in a String

Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
*/
class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
       HashMap<Character,Integer> hmap = new HashMap<>();
        for(char c : s.toCharArray()){
            if(hmap.containsKey(c)){
                hmap.put(c,-1);
            } else {
                hmap.put(c,1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(hmap.get(s.charAt(i))!= -1){
                return i;
            }
        }
        return -1;
    }
}
