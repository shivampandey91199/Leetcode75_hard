package Leetcode75hard;

import java.util.Arrays;

/*
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */
public class Movezero {
	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 3, 12 };
		int[] arr=moveZeros(nums);
	System.out.println(Arrays.toString(arr));
	}

	private static int[] moveZeros(int[] nums) {
		int index = 0;
		for (int num : nums) {
			if (num != 0) {
				nums[index++] = num;
			}
		}
		while (index < nums.length) {
			nums[index++] = 0;
		}
		return nums;
	}
}
