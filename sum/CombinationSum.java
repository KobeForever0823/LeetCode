import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> solution(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> levelRes = new ArrayList<Integer>();
		Arrays.sort(candidates);

		doCombination(candidates, 0, target, res, levelRes);
		return res;
	}

	void doCombination(int[] candidates, int start, int target, List<List<Integer>> res, List<Integer> levelRes) {
		if (target < 0) return;
		if (target == 0) res.add(new ArrayList<Integer>(levelRes)); // create a new arraylist object to send value to it
		for (int i = start; i < candidates.length; i++) {
			levelRes.add(candidates[i]);
			doCombination(candidates, i, target - candidates[i], res, levelRes);
			levelRes.remove(levelRes.size() - 1);
		}
	}

	public static void main(String args[]) {
		int[] nums = {2, 3, 6, 7};
		CombinationSum cs = new CombinationSum();
		cs.solution(nums, 7);
		System.out.println(cs.solution(nums, 7));
	}
}