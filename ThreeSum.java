package leetcode;
import java.util.*;

public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
		// create output with type List<List<Integer>> 
		List<List<Integer>> output = new ArrayList<>();
		// sort the given array to slide the pointer later
		Arrays.sort(nums);
		
		for (int i = 0; i < nums.length - 2; i++) {
			int start = i + 1;
			int end = nums.length - 1;
			
			// value of current pointer from i need to be different with
			// previous value
			if (i == 0 || (nums[i] != nums[i-1])) {
				// moving start and end pointer
				while (start < end) {
					int current = nums[i] + nums[start] + nums[end];
					if (current == 0) {
						List<Integer> triplet = Arrays.asList(nums[i], nums[start], nums[end]);
						output.add(triplet);
						
						// check duplicate in triplet
						// loop the start pointer up when its next value the same
						while (start < end && nums[start] == nums[start+1]) start++;
						// same thing for end pointer
						while (start < end && nums[end] == nums[end-1]) end--;
						
						start++;
						end--;
					}
					
					else if (current > 0) end--;
					else {
						start++;
					}
				}
				
			}
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		// Input: [-1,0,1,2,-1,-4]
		// Output: [[-1,-1,2],[-1,0,1]]
		
		
		// Input: [-2, 0, 0, 2, 2]
		// Output: [[-2, 0, 2]]
		
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> output = threeSum(nums);
		
		System.out.println("Input: nums = " + Arrays.toString(nums));
		System.out.println("Output is: " + output.toString());
	}

}
