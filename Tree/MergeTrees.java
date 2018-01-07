class MergeTrees {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null) return t2;
		if (t2 == null) return t1;
		int newVal = t1.val + t2.val;
		TreeNode pNew = new TreeNode(newVal);
		pNew.left = mergeTrees(t1.left, t2.left);
		pNew.right = mergeTrees(t1.right, t2.right);
		return pNew;
	}
}