package leetcode;
import java.util.*;

public class Permutations {

	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        boolean[] isVisit = new boolean[nums.length]; // [false, false, false]
        backtracking(nums, output, new ArrayList<Integer>(), isVisit);
        
        return output;
    }
	
	public static void backtracking(int[] nums, List<List<Integer>> output, List<Integer> cur, boolean[] isVisit) {
		if (cur.size() == nums.length) {
			output.add(new ArrayList<Integer>(cur));
			return;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (isVisit[i] == true) continue;
			
			cur.add(nums[i]);
			isVisit[i] = true;
			backtracking(nums, output, cur, isVisit);
			cur.remove(cur.size()-1);
			isVisit[i] = false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Input: nums = [1,2,3]
//		Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
		
		int[] input = {1,2,3};
		System.out.println("Input: " + Arrays.toString(input));
		
		List<List<Integer>> output = Permutations.permute(input);
		System.out.println("Output: " + output.toString());
	}

}
