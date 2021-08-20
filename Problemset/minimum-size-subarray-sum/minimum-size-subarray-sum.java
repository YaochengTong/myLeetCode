
// @Title: 长度最小的子数组 (Minimum Size Subarray Sum)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-20 05:59:02
// @Runtime: 2 ms
// @Memory: 38.1 MB

class Solution {

    public int minSubArrayLen(int target, int[] nums) {
        int p1 = 0, p2 = 0, sum = 0;
        int minLen = Integer.MAX_VALUE;
        while (p2 < nums.length) {
            sum += nums[p2];
            while (sum >= target) {
                minLen = Math.min(minLen, p2 - p1 + 1);
                sum -= nums[p1];
                p1++;
            }
            p2++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

}

