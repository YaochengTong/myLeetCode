
// @Title: 移除元素 (Remove Element)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-20 00:01:03
// @Runtime: 0 ms
// @Memory: 37 MB

class Solution {
    public int removeElement(int[] nums, int val) {
        int p1 = 0, p2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) { continue; }
            nums[p1++] = nums[i];
        }
        return p1;
    }
}
