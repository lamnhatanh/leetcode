package leetcode;


public class containerMostWater {

	private static int maxArea(int[] height) {
		int max = 0;
//		
//		for (int i = 0; i < height.length; i++) {
//			for (int j = i + 1; j < height.length; j++) {
//				int currentArea = Math.min(height[i], height[j]) * (j - i);
//				max = Math.max(max, currentArea);
//			}
//		}
		
		// initialize left and right pointer
		int left = 0;
		int right = height.length - 1;
		
		// while left < right
		while (left < right) {
			// calculate the current area
			int currentArea = Math.min(height[left], height[right]) * (right - left);
			max = Math.max(max, currentArea);
			
			// take decision which pointer to move
			if (height[left] < height[right]) {
				left++;
			} else {
				right--;
			}
		}
				
		return max;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(containerMostWater.maxArea(height));
		
	}

}
