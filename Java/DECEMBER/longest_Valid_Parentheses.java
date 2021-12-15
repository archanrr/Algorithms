/*
Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.
Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".
Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".
Example 3:

Input: s = ""
Output: 0
*/
class longest_Valid_Parentheses {
    public int longestValidParentheses(String s) {
        char[] stack = new char[s.length()];
        int count = 0;
        int top = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack[++top] = '(';
            } else if(s.charAt(i)==')' && top>=0){
                count++;
                top--;
                if(top == -1){
                    stack[top++]
                }
                else{
                    maxLength = Math.max(maxLength, i - stack[0]);
                }
            }
        }
        return count*2;
    }
}
