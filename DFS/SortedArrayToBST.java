public class SortedArrayToBST {
	public TreeNode solution(int[] nums) {
		if (nums.length == 0) return null;
		return buildBST(nums, 0, nums.length);
	}

	private TreeNode buildBST(int[] nums, int start, int end) {
		if (start >= end) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode temp = new TreeNode(nums[mid]);
		temp.left = buildBST(nums, start, mid);
		temp.right = buildBST(nums, mid + 1, end);
		return temp;
	}
}