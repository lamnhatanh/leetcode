package leetcode;
import java.util.*;
public class RomanToInt {

	public static int romanToInt(String s) {
		int output = 0;
		Map<Character, Integer> values = new HashMap<>();
		values.put('M', 1000);
        values.put('D', 500);
        values.put('C', 100);
        values.put('L', 50);
        values.put('X', 10);
        values.put('V', 5);
        values.put('I', 1);
        
        
        for (int i = 0; i < s.length(); i++) {
            if (i!=0 && values.get(s.charAt(i)) > values.get(s.charAt(i-1))) {
                int value = values.get(s.charAt(i)) - 2 * values.get(s.charAt(i-1));
                output += value;
            } else {
                output += values.get(s.charAt(i));
            }
        }
		
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "MCMXCIV";
		System.out.println("Input: " + input);
		
		int output = romanToInt(input);
		System.out.println("Output: " + output);
	}

}
