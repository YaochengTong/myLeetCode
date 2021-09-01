
// @Title: 删除有序数组中的重复项 II (Remove Duplicates from Sorted Array II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-09-01 16:00:42
// @Runtime: 0 ms
// @Memory: 38.8 MB

class Solution {

    public int removeDuplicates(int[] nums) {
        int k = 0, tempCount = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[++k] = nums[i];
                tempCount = 0;
            } else if (tempCount < 1) {
                nums[++k] = nums[i];
                tempCount++;
            } 
        }

        return k + 1;
    }

}

