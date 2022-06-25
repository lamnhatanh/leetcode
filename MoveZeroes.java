package leetcode;

import java.util.*;

public class MoveZeroes {

	public static void moveZeroes(int[] nums) {
		// time: o(n)
		// space: o(1)
		
		int length = nums.length;
		int lastNonZeroPosition = 0; 
		
		for (int i = 0; i < length; i++) {
			// if the element is not 0
			// then we will assign that element to the pointer lastNonZeroPosition
			// example: [1,1,0,3,12]
			// lastNonZeroPosition pointer then increase 1
			// => lastNonZeroPosition = 1
			if (nums[i] != 0) {
				nums[lastNonZeroPosition] = nums[i];
				lastNonZeroPosition++;
			}
		}
		
		// fill up all 0, starting at lastNonZeroPosition
		for (int i = lastNonZeroPosition; i < length; i++) {
			nums[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		// input: [0,1,0,3,12]
		// output: [1,3,12,0,0]
		int[] nums = {0,1,0,3,12};
		System.out.println("Input: " + Arrays.toString(nums));
		moveZeroes(nums);
		System.out.println("Output: " + Arrays.toString(nums));
	}

}
