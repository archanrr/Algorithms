// Java program for checking
// balanced brackets
import java.util.*;
 
public class BalancedBrackets {
 
    // function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
            = new ArrayDeque<Character>();
 
        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                System.out.println("Conteents of Stack: "+stack);
                continue;
            }
 
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                System.out.println("check: "+check);
                System.out.println("1pop ->"+stack);
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                System.out.println("check: "+check);
                System.out.println("2pop ->"+stack);
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                System.out.println("check: "+check);
                System.out.println("3pop ->"+stack);
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        // Check Empty Stack
        return (stack.isEmpty());
    }
    public static boolean isSqBalanced(String str) {
    	int opSq = 0;
    	for(int i=0;i<str.length();i++) {
    		if(str.charAt(i) == '[') opSq++;
    		else if(str.charAt(i) == ']') {
    			if(opSq<=0) return false;
    			else {
    				opSq--;
    			}
    		}
    	}
    	if(opSq==0) return true;
		return false;
    	
    }
 
    // Driver code
    public static void main(String[] args)
    {
        String expr = "{()((([{}()])))";
 
        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
        
     // Function call
        if (isSqBalanced(expr))
            System.out.println("Balanced-1 ");
        else
            System.out.println("Not Balanced-1 ");
    }
}