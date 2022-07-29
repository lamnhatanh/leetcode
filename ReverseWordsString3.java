package leetcode;

public class ReverseWordsString3 {

	public static String reverseWords(String s) {
		String ans = "";
		int start = 0;
		int end = 0;
		
		while (start < s.length()) {
			while (end < s.length() && s.charAt(end) != ' ') {
				end++;
			}
			
			ans += reverse(s.substring(start, end));
			
			if (end < s.length()) ans += " ";
			
			start = end + 1;
			++end;
		}
		
		return ans;
	}
	
	public static String reverse(String s) {
		String result = "";
		
		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: s = "Let's take LeetCode contest"
//		Output: "s'teL ekat edoCteeL tsetnoc"
		
		String s = "Let's take LeetCode contest";
		String output = reverseWords(s);
		
		System.out.println(output);

		
	}

}
