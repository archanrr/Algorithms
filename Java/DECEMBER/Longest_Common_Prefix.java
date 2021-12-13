/*
Longest Common Prefix
 
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

*/
class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n==1) return strs[0];
        if(n==0) return "";
        String str = strs[0];
        int i;
        for(i=0;i<str.length();i++){
            for(int j=1;j<n;j++){
                if(strs[j].length()==i) return str.substring(0,i);
                //System.out.println(""+(strs[j].charAt(i)==str.charAt(i)));
                if(!(strs[j].charAt(i)==str.charAt(i))){
                    return str.substring(0,i);
                }
            }
        }
        return str.substring(0,i);
    }
}
