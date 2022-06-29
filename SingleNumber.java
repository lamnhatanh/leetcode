package leetcode;

import java.util.*;

public class SingleNumber {
	public static int singleNumber(int[] nums) {
        // create hash map
        Map<Integer, Integer> hm = new HashMap<>();
        
        // loop through to count the occurance of number
        for (int i=0; i<nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        
        
        for (int num : nums) {
            if (hm.get(num) == 1) return num;
        }
        
        return 0;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,7,7,7,7,1,1,1,7,7,7,1,1,1};
		System.out.println("Input: " + Arrays.toString(nums));
		System.out.println("Output: " + SingleNumber.singleNumber(nums));
	}
}
