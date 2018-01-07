import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<Integer>();
        List<Integer> res = new ArrayList<Integer>();
        rightView(root, res, 0);
        return res;
    }

    public void rightView(TreeNode root, List<Integer> res, int currLevel) {
        if (root == null) return;
        if (currLevel == res.size()) {
            res.add(root.val);
        }
        rightView(root.right, res, currLevel + 1);
        rightView(root.left, res, currLevel + 1);
    }

}