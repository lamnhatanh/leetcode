package leetcode;

public class LongestPalindromicSubstringBruteForce {

	public static String longestPalindrome(String s) {
        String result = "";
        
        for (int i= 0; i < s.length(); i++) {
        	
//        	for (int j = i + 1; j < s.length(); j++) {
//                boolean check = result.length() < s.substring(i, j+1).length();
//                if (check && checkPalindrome(s.substring(i, j+1))) {
//                    result = s.substring(i, j+1);
//                }
//            }
        	
        	
            for (int j = s.length() - 1; j > i; j--) {
                if (result.length() < s.substring(i, j+1).length() && checkPalindrome(s.substring(i, j+1))) {
                    result = s.substring(i, j+1);
                    break;
                }
            }
        }
        
        if (result.length() > 0) return result;
        
        return result + s.charAt(0);
        
    }
    
    private static boolean checkPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
            
        }
        
        return true;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "babad";
		String output = longestPalindrome(input);
		System.out.println(output);
	}

}
