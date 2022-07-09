package leetcode;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters {
	public static int lengthOfLongestSubstring(String s) {
		Set<Character> hs = new HashSet<>();
		int left_pointer = 0;
		int right_pointer = 0;
		int maxLength = 0;
		
		while (right_pointer < s.length()) {
			if (hs.contains(s.charAt(right_pointer))) {
				hs.remove(s.charAt(left_pointer));
				left_pointer++;
			} else {
				hs.add(s.charAt(right_pointer));
				right_pointer++;
				maxLength = Math.max(maxLength, hs.size());
			}
		}
		
		return maxLength;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: s = "abcbcbb"
//		Output: 3
		
		String s = "abcbcbb";
		int output = lengthOfLongestSubstring(s);
		System.out.println(output);
	}

}
