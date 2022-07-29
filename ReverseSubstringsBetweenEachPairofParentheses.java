package leetcode;
import java.util.*;
public class ReverseSubstringsBetweenEachPairofParentheses {

	public static String reverseParentheses(String s) {
        String res = "";
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                
                while (stack.peek() != '(') {
                    queue.add(stack.pop());
                }
                stack.pop();
                
                while (!queue.isEmpty()) {
                    stack.add(queue.remove());
                }
                
            } else {
                stack.push(s.charAt(i));
            }
        }
        
        char[] arr = new char[stack.size()];
        
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        
        return res;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(u(love)i)";
		String output = reverseParentheses(s);
		System.out.println(output);
	}

}
