
// @Title: 下一个更大元素 I (Next Greater Element I)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-06 23:59:12
// @Runtime: 3 ms
// @Memory: 38.7 MB

class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums2.length; i++) {
            int nextGreaterNumber = findNextGreaterNumber(nums2, i);
            map.put(nums2[i], nextGreaterNumber);
        }
        for (int j = 0; j < nums1.length; j++) { result[j] = map.get(nums1[j]); }
        return result;
    }

    private int findNextGreaterNumber(int[] nums, int currentIndex) {
        if (currentIndex > nums.length - 1) { return -1; }
        int currentValue = nums[currentIndex];
        for (int i = currentIndex + 1; i < nums.length; i++) {
            if (nums[i] > currentValue) { return nums[i]; }
        }
        return -1;
    }
    
}
