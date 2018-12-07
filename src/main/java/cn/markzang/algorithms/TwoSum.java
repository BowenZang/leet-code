package cn.markzang.algorithms;

import org.junit.Test;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @author BowenZang
 * @since 2018年12月07日
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		int[] indexs = new int[2];
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					indexs[0] = i;
					indexs[1] = j;
					break;
				}
			}
		}
		
		return indexs;
	}
	
	@Test
	public void DemoTest() {
		int[] nums = new int[]{2, 7, 11, 15};
		int target = 9;
		System.out.println(twoSum(nums, target));
	}
}
