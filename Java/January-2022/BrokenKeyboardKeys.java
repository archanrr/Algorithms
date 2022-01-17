/*
17/1/2022:

1935. Maximum Number of Words You Can Type

There is a malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.

Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.
*/
class BrokenKeyboardKeys {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> keybroken = new HashSet<Character>();
        for(int i=0;i<brokenLetters.length();i++){
            keybroken.add(brokenLetters.charAt(i));
        }
        String[] words = text.split(" ");
        int count = 0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(keybroken.contains(words[i].charAt(j))){
                    count++;
                    break;
                }
            }
        }
        return words.length - count;
    }
}
