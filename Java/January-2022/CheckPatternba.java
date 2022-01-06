/*
2124. Check if All A's Appears Before All B's

Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.
*/
class CheckPatternba {
    public boolean checkString(String s) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a') {
                a = Math.max(a,i);
            }
            if(s.charAt(i)=='b') {
                b=Math.min(b,i);
            }
        }
        System.out.print("a "+a+" b "+b);
        if(a-b<0) return true;
        else return false;
    }
}
/*
Alternate Soln

return s.indexOf("ba") == -1;
*/
