public class BSTIterator {

    public BSTIterator(TreeNode root) {
        pushLeft(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.empty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode topNode = stack.peek();
        stack.pop();
        pushLeft(topNode.right);
        return topNode.val;
    }

    private Stack<TreeNode> stack = new Stack<>();

    private void pushLeft(TreeNode p) {
        while (p != null) {
            stack.push(p);
            p = p.left;
        }
    }
}