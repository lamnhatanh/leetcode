package leetcode;

import java.util.Arrays;

public class PlusOne {
	 public static int[] plusOne(int[] digits) {
	      
	      for (int i = digits.length - 1; i >= 0; i--) {
	          if (digits[i] == 9) digits[i] = 0;
	          
	          else {
	              digits[i]++;
	              return digits;
	          }
	      }
	      
	      // create new arr
	      int[] newDigits = new int[digits.length + 1];
	      // first element has to be 1 
	      newDigits[0] = 1;
	      return newDigits;
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1,9};
		int[] output = plusOne(input);
		System.out.println(Arrays.toString(output));
	}

}
