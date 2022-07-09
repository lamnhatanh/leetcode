package leetcode;

public class ExcelSheetColNum {
	 public static int titleToNumber(String columnTitle) {
		 int result = 0;
		 for (char c : columnTitle.toCharArray()) {
			 // get the value for the current character
			 int currentVal = c - 'A' + 1;
			 
			 // calculate the result
			 // Ex: A = 1, AA = 1*26+1 =27, AAA = 27*26+1 = 703
			 // A* = 1 * 26 + 1.       AA AB AC....AZ
			 // B* = 2 * 26 + 1
			 // AA* = 27 * 26 + 1
			 result = result * 26 + currentVal;
		 }
		 
		 return result;
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "AB";
		System.out.println(input);
		
		int output = titleToNumber(input);
		System.out.println(output);
	}

}
