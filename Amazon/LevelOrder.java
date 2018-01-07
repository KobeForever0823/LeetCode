class LevelOrder {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if (root == null) return res;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			int qsize = queue.size();
			List<Integer> levelRes = new ArrayList<>();
			for (int i = 0; i < qsize; i++) {
				TreeNode tmp = queue.poll();
				levelRes.add(tmp.val);
				if (tmp.left != null) {
					queue.add(tmp.left);
				}
				if (tmp.right != null) {
					queue.add(tmp.right);
				}
			}
			res.add(levelRes);
		}
		return res;
	}
}