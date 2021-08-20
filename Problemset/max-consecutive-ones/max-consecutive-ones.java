
// @Title: 最大连续 1 的个数 (Max Consecutive Ones)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-20 00:12:48
// @Runtime: 2 ms
// @Memory: 40.2 MB

class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int tempCount = 0;
        for (int n : nums) {
            if (n == 1) {
                tempCount++;
            } else {
                count = Math.max(tempCount, count);
                tempCount = 0;
            }
        }
        count = Math.max(tempCount, count);
        return count;
    }

}

