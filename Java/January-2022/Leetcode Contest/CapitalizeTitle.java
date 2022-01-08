/*
2129. Capitalize the Title

You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that:

If the length of the word is 1 or 2 letters, change all letters to lowercase.
Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
Return the capitalized title.
*/
class CapitalizeTitle {
    public String capitalizeTitle(String title) {
        String[] str = title.split(" ");
        StringBuilder sb = new StringBuilder();
        int i=0;
       for(String s : str){
           s = s.toLowerCase();
           if(s.length()<3){
               str[i] = s;
               sb.append(str[i]);
               if(i!=str.length-1) sb.append(" ");
               i++;
               continue;
           }
           str[i] = s.substring(0,1).toUpperCase()+s.substring(1,s.length());
           sb.append(str[i]);
           if(i!=str.length-1) sb.append(" ");
           i++;
       }
        return sb.toString();
    }
}
