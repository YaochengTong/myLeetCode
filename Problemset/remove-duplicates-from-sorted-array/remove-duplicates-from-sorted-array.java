
// @Title: 删除排序数组中的重复项 (Remove Duplicates from Sorted Array)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-09-01 15:57:22
// @Runtime: 1 ms
// @Memory: 39.8 MB

class Solution {

    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[k + 1] = nums[i];
                k++;
            }
        }
        return k + 1;
    }

}
