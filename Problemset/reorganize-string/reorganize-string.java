
// @Title: 重构字符串 (Reorganize String)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-15 00:47:53
// @Runtime: 1 ms
// @Memory: 36.7 MB

class Solution {

    public String reorganizeString(String S) {

        // Find maxIndex
        char[] charArray = S.toCharArray();
        int[] countCharacters = new int[26];
        for (char c : charArray) { countCharacters[c - 'a']++; }
        int maxIndex = getMaxIndex(countCharacters);
        if (countCharacters[maxIndex] > (S.length() + 1) / 2) { return ""; }

        // Append maxIndex character to result
        char[] res = new char[S.length()];
        int i = 0;
        while (countCharacters[maxIndex] > 0) {
            countCharacters[maxIndex]--;
            res[i] = (char) ('a' + maxIndex);
            i += 2;
        }

        // Append other characters to result
        for (int j = 0; j < countCharacters.length; j++) {
            while (countCharacters[j]-- > 0) {
                if (i >= S.length()) { i = 1; }
                res[i] = (char) ('a' + j);
                i += 2;
            }
        }
        
        return String.valueOf(res);
    }

    private int getMaxIndex(int[] nums) {
        int maxAt = 0;
        for (int i = 0; i < nums.length; i++) {
            maxAt = nums[i] > nums[maxAt] ? i : maxAt;
        }
        return maxAt;
    }

}

