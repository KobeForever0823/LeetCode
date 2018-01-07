class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtrack(res, new ArrayList<Integer>(), nums, 0);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> tmpList, int[] nums, int start) {
        res.add(new ArrayList<>(tmpList));
        for (int i = start; i < nums.length; i++) {
            tmpList.add(nums[i]);
            backtrack(res, tmpList, nums, i + 1);
            tmpList.remove(tmpList.size() - 1);
        }
    }
}