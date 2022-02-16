/*
16/2/2022: 557. Reverse Words in a String III

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
*/
class ReverseWordsStringWithSpaces {
    public String reverseWords(String s) {
        String[] stringArr = s.split(" ");
        String res= "";
        for(String str : stringArr){
            res+=reverse(str)+" ";
        }
        return res.substring(0, res.length() - 1);
    }
    public String reverse(String str){
        StringBuilder sbf = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sbf.append(str.charAt(i));
        }
        return sbf.toString();
    }
}
