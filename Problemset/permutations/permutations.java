
// @Title: 全排列 (Permutations)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-08-26 11:06:52
// @Runtime: 1 ms
// @Memory: 38.5 MB

class Solution {

    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        backTrack(nums);
        return result;
    }

    private void backTrack(int[] nums) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!temp.contains(nums[i])) {
                temp.add(nums[i]);
                backTrack(nums);
                temp.remove(temp.size() - 1);
            }
        }
    }

}
