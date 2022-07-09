package leetcode;
import java.util.*;
public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		// set prefix as a string at first index
		String prefix = strs[0];
		
		// looping at first index to compare
		for (int i = 1; i < strs.length; i++) {
			// return index if flower is in strs[i]
			// return -1 if couldn't get any index
			while (strs[i].indexOf(prefix) != 0) {
				// remove the last character of prefix
				// to remove a string, use substring(0, prefix.length() - 1)
				prefix = prefix.substring(0, prefix.length() - 1);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}
		
		return prefix;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"flower","flow","flight"};
		System.out.println("Input: " +Arrays.toString(strs));
		
		String output =  longestCommonPrefix(strs);
		System.out.println("Output: " + output);
	}

}
