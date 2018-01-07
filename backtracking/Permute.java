class Permute {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack(res, new ArrayList<>(), nums);
        return res;
    }

    public void backTrack(List<List<Integer>> res, List<Integer> tmpList, int[] nums) {
        if (tmpList.size() == nums.length) {
            res.add(new ArrayList<>(tmpList));
        }
        for (int i = 0; i < nums.length; i++) {
            if (tmpList.contains(nums[i])) continue;
            tmpList.add(nums[i]);
            backTrack(res, tmpList, nums);
            tmpList.remove(tmpList.size() - 1);
        }
    }
}