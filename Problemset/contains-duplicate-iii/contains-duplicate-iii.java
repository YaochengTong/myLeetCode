
// @Title: 存在重复元素 III (Contains Duplicate III)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-05-07 03:03:19
// @Runtime: 40 ms
// @Memory: 40.2 MB

class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> set = new TreeSet<Long>();
        for (int i = 0; i < nums.length; i++) {
            Long ceiling = set.ceiling((long) nums[i] - (long) t);
            if (ceiling != null && ceiling <= (long) nums[i] + (long) t) { return true; }
            set.add((long) nums[i]);
            if (i >= k) { set.remove((long) nums[i - k]); }
        }
        return false;
    }
}
