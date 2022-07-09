package leetcode;

import java.util.*;

public class IntersectionTwoArraysII {

	private static int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> counter = new HashMap<>();
		for (int i : nums1) {
			counter.put(i, counter.getOrDefault(i, 0) + 1);
		}
		
		int index = 0;
		for (int j : nums2) {
			int count = counter.getOrDefault(j, 0);
			if (count > 0) {
				nums1[index++] = j;
				counter.put(j, counter.get(j) - 1);
			}
		}
		
		return Arrays.copyOf(nums1, index);
		
		
	}
	
	public static void main(String[] args) {
		// Each element in the result must appear as many times as it shows in both arrays
		// and you may return the result in any order.
		
//		Input: nums1 = [1,2,2,1], nums2 = [2,2]
//		Output: [2,2]
//						
//		Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//		Output: [4,9]
//		Explanation: [9,4] is also accepted.
		
		int[] nums1 = {9,4,9,8,4};
		int[] nums2 = {4,9,5};
		
		System.out.println(Arrays.toString(intersect(nums1, nums2)));

	}

}
