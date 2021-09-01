
// @Title: 只出现一次的数字 (Single Number)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-08-26 15:43:01
// @Runtime: 10 ms
// @Memory: 38.9 MB

class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num: nums) {
            if (!set.contains(num)) { 
                set.add(num); 
            } else {
                set.remove(num);
            }

        }
        return set.iterator().next();
    }
}
