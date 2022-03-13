/*
13/3/2022 : 13. Roman to Integer 
*/
class RomanToInteger {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        
        int result = 0;
        
        Map<Character, Integer> dictionary = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        
        for (int i = s.length() - 1; i >= 0; i--) {
            result += dictionary.get(s.charAt(i));

            if (i > 0) {
                if ((s.charAt(i) == 'V' || s.charAt(i) == 'X') && s.charAt(i-1) == 'I') {
                    result -= 1;
                    i--;
                } else if ((s.charAt(i) == 'L' || s.charAt(i) == 'C') && s.charAt(i-1) == 'X') {
                    result -= 10;
                    i--;
                } else if ((s.charAt(i) == 'D' || s.charAt(i) == 'M') && s.charAt(i-1) == 'C') {
                    result -= 100;
                    i--;
                }
            }
        }
        
        return result;
    }
}
