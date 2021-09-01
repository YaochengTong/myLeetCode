
// @Title: 下一个排列 (Next Permutation)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-08-26 16:04:31
// @Runtime: 0 ms
// @Memory: 38.7 MB

class Solution {

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void reverse(int[] nums, int index) {
        int low = index, high = nums.length - 1;
        while (low < high) { 
            swap(nums, low, high); 
            low++;
            high--;
        }
    }

}

