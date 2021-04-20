
// @Title: 最长回文子串 (Longest Palindromic Substring)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-17 22:29:51
// @Runtime: 31 ms
// @Memory: 38.5 MB

class Solution {

    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int exLen = Math.max(expendLength(s, i, i), expendLength(s, i, i + 1));
            if (exLen > end - start) {
                start = i - (exLen - 1) / 2;
                end = i + exLen / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expendLength(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right)) { break; }
            left--;
            right++;
        }
        return right - left - 1;
    }

}


