/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I

*/
class ZigZagPatterenPrinting {
    public String convert(String s, int numRows) {
        //ArrayList<Character> res = new Array   List<Character>();
        char[] res = new char[s.length()];
        int ptr = 0;
        int increment = (numRows-1)*2;
        for(int i=0;i<numRows;i++){
            for(int c = i; c < s.length() && ptr< s.length();c+=increment){
                int oddChar = increment - 2*i;
                res[ptr] = s.charAt(c);
                ptr++;
                System.out.print(" "+s.charAt(c));
                if(i>0 && i< numRows-1 && ptr< s.length()&&  ptr+oddChar<s.length()){
                    
                    res[ptr] = s.charAt(i+oddChar);
                    System.out.print(" "+s.charAt(i+oddChar));
                    ptr++;
                }
            }
        }
        return Arrays.toString(res);
    }
}
