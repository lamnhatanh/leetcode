package leetcode;
import java.util.*;
public class ValidParentheses {
	public static boolean isValid(String s) {
		Map<Character, Character> hm = new HashMap<>();
		hm.put('(', ')');
	    hm.put('{', '}');
	    hm.put('[', ']');
	    
		Stack<Character> stack = new Stack<>();
		
		// base case
		if (s.length() % 2 != 0) return false;
		
		for (char c : s.toCharArray()) {
			// in case it is an opened brackets
			if (hm.containsKey(c)) stack.push(c);
			
			// case it is a closed bracket of corresponding open bracket
			// c = ')' means top of stack has to be '('
			else if (!stack.isEmpty() && c == hm.get(stack.peek())) {
				stack.pop();
			}
			
			// else case like this: "( [ } } ] )"
			// the closed doesn't match the top of stack
			else {
				return false;
			}
		}
		
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "([}}])";
		System.out.println(input);
		
		boolean output = isValid(input);
		System.out.println(output);
	}

}
