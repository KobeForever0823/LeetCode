public class twoSum {
	public int[] solution(int[] nums, int target) {
		int[] res = new int[2];
		for (int i = 0; i < nums.length; i++) {
			int value = target - nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (value == nums[j]) {
					res[0] = i;
					res[1] = j;
				}
			}
		}
		return res;
	}
}