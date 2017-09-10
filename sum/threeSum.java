import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nicolas on 9/10/17.
 */
public class threeSum {
	public List<List<Integer>> solution(int[] nums, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		int size = nums.length;
		if (size < 3) return res;
		for (int k = 0; k < size - 2; k++) {
			if (k > 0 && nums[k] == nums[k - 1]) continue;  // remove the same item to ensure the result to be unique
			int i = k + 1, j = size - 1;
			int key = target - nums[k];
			while (i < j) {
				if (nums[i] + nums[j] == key) {
					List<Integer> levelRes = new ArrayList<Integer>();
					levelRes.add(0, nums[k]);
					levelRes.add(1, nums[i]);
					levelRes.add(2, nums[j]);
					res.add(levelRes);
					i++;
					j--;
					while (nums[i] == nums[i - 1] && i < size - 1) i++; // margin
					while (nums[j] == nums[j + 1] && j > 0) j--;
				} else if (nums[i] + nums[j] < key) i++;
				else j--;
			}

		}
		return res;
	}

	public static void main(String[] args) {
		int[] nums = {0, 0, 0};
		threeSum ts = new threeSum();
		ts.solution(nums, 0);
		System.out.println(ts.solution(nums, 0));
	}
}