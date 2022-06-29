package leetcode;

import java.util.*;
//import java.util.Map.Entry;

public class MajorityElement {
	
	public static int majorityElement(int[] nums) {
//		int maxCounter = 0;
//		int majorityNum = -1;
//		
//		// main pointer
//		for (int i = 0; i < nums.length; i++) {
//            int counter = 0;
//            // pointer to compare with the main one
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j]) counter++;
//            }
//            
//            if (maxCounter < counter) {
//                maxCounter = counter;
//                majorityNum = nums[i];
//            }
//        }
//		
//		return majorityNum;
		
		// create hashmap
		Map<Integer, Integer> countNum = new HashMap<>();
		int maxCounter = -1;
		
		for (int i = 0; i < nums.length; i++) {
			if (countNum.containsKey(nums[i])) {
				countNum.put(nums[i], countNum.get(nums[i]) + 1);
			}
			else {
				countNum.put(nums[i], 1);
			}
		}
		
		
		for (int i : nums) {
			if (maxCounter < countNum.get(i)) {
				maxCounter = countNum.get(i);
			}
		}
		
		for (int i : nums) {
			if (countNum.get(i) == maxCounter) {
				return i;
			}
		}
		
		// iterate each entry of hash map
//	    for (Entry<Integer, Integer> entry : countNum.entrySet()) {
//	    	// check which one have counter the most
//	    	// and set the max counter to it
////	    	if (maxCounter < entry.getValue()) {
////	    		maxCounter = entry.getValue();
////	    	}
//	    }
//	    
	 // iterate each entry of hash map
//	    for (Entry<Integer, Integer> entry : countNum.entrySet()) {
//	    	// which one has the appear the most
//	    	// then show the key of that value out
//	    	if (entry.getValue().equals(maxCounter)) {
//	    		return entry.getKey();
//	    	}
//	    }
		
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,7,7,7,7,7,1,1,1,2,7,7,7,2,1,1,1};
		System.out.println("Input: " + Arrays.toString(nums));
		System.out.println("Output: " + MajorityElement.majorityElement(nums));
	}

}
