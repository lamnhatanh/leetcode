package leetcode;

public class LongestPalindromicSubstring {

	public static String longestPalindrome(String s) {
		int start = 0;
		int end = 0;
		
		for (int i = 0; i < s.length(); i++) {
			// case odd length: rac e car  length = 7
			int len1 = expandFromMiddle(s, i, i);
			// case even length: aabbaa length = 6
			int len2 = expandFromMiddle(s, i, i + 1);
			// compare to see what case we hit
			int len = Math.max(len1, len2);
			
			if (end - start + 1 < len) {
				start = i - ((len - 1) / 2);
				end = i + (len / 2);
			}
		}
		
		return s.substring(start, end + 1);
	}
	
	public static int expandFromMiddle(String s, int left, int right) {
		while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
			left--;
			right++;
		}
		// return the length
		return right - left - 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "cbaabba";
		String output = longestPalindrome(input);
		System.out.println(output);
	}

}
