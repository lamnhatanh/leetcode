package leetcode;
import java.util.*;
public class IntersectionTwoArrays {
	public static int[] intersection(int[] nums1, int[] nums2) {
//		Set<Integer> hs = new HashSet<>();
//		
//		for (int i : nums1) {
//			for (int j : nums2) {
//				if (i == j) {
//					hs.add(i);
//				}
//			}
//		}
//		List<Integer> list = new ArrayList<>(hs);
//		int[] ans = new int[hs.size()];
//		int index = 0;
//		for (Integer i : hs) {
//			ans[index++] = i;
//		}
//		for (Integer i : hs) {
//			System.out.println(i);
//		}
//		return ans;
		
		
		Set<Integer> hs = new HashSet<>();
		int[] output = new int[nums2.length];
		for (int i : nums1) {
			hs.add(i);
		}
		int k = 0;
		for (int j : nums2) {
			if (hs.contains(j)) {
//				list.add(j);
				output[k++] = j;
				hs.remove(j);
			}
		}
		
//		int[] output = new int[list.size()];
//		for (int i = 0; i < output.length; i++) {
//			output[i] = list.get(i);
//		}
		return Arrays.copyOfRange(output, 0, k);
	}
	
	
	public static void main(String[] args) {
		// Each element in the result must be unique
		// and you may return the result in any order.
		
		// Input: nums1 = [1,2,2,1], nums2 = [2,2]
		// Output: [2]
		
//		Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//		Output: [9,4]
//		Explanation: [4,9] is also accepted.
		
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		
		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}

}
