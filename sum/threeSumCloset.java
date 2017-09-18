import java.util.Arrays;

public class threeSumCloset {
	public int solution(int[] nums, int target) {
		int size = nums.length;
		if (size < 3) return Integer.MAX_VALUE;
		Arrays.sort(nums);
		int minDif = Integer.MAX_VALUE;
		for (int k = 0; k < size - 2; k++) {
			if (k > 0 && nums[k] == nums[k - 1]) continue;
			int i = k + 1, j = size - 1;
			while (i < j) {
				int dif = nums[i] + nums[j] + nums[k] - target;
				if (Math.abs(dif) < Math.abs(minDif)) minDif = dif;
				if (dif == 0) break;
				else if (dif < 0) i++;
				else j--;
			}
		}
		return target + minDif;
	}

	public static void main(String args[]) {
		int[] nums = { -1, 2, 1, -4};
		int target = 1;
		threeSumCloset ts = new threeSumCloset();
		ts.solution(nums, target);
		System.out.println(ts.solution(nums, target));
	}
}