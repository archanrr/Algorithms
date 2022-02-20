/*
21/2/2022: 567. Permutation in String

Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.
*/
class findPermutionOnAnotherString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        
        int[] one = new int[26];
        int[] two = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            one[s1.charAt(i) - 'a']++;
            two[s2.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            if (i != 0) {
                // exclude first character
                two[s2.charAt(i - 1) - 'a']--;
                // include last character
                two[s2.charAt(i + s1.length() - 1) - 'a']++;
            }

            if (areEqual(one, two)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean areEqual(int[] one, int[] two) {
        for (int i = 0; i < one.length; i++) {
            if (one[i] != two[i]) {
                return false;
            }
        }
        return true;
    }
}
