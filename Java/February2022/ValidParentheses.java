/*
5/2/2022: 20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
 
Example 1:

Input: s = "()"
Output: true
*/
class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length() < 2 || s.length() % 2 != 0) return false;
        
        if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') return false;
        
        if(s.charAt(s.length() - 1) == '(' || s.charAt(s.length() - 1) == '[' || s.charAt(s.length() - 1) == '{') return false;
        
        var stack = new Stack<Character>();
        
        stack.add(s.charAt(0));
        
        int i = 1;
        
        while(i < s.length()){
            
            char ch = s.charAt(i);
            
            if(stack.isEmpty()){
                stack.add(ch);
                i = i + 1;
                ch = s.charAt(i);
            }
            
            if((ch == ')' && stack.peek() == '(')
              || (ch == ']' && stack.peek() == '[')
              || (ch == '}' && stack.peek() == '{')){
                stack.pop();
            } else {
                stack.add(ch);
            }
            
            i++;
        }
        
        return stack.isEmpty();
    }
}
