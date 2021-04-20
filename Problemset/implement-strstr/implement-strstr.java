
// @Title: 实现 strStr() (Implement strStr())
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-19 23:51:13
// @Runtime: 10 ms
// @Memory: 38.5 MB

class Solution {

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) { return 0; }
        int[] pi = computePrefixFunction(needle);
        for (int i = 0, j = 0; i < haystack.length(); i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) { j++; }
            if (j == needle.length()) { return i - needle.length() + 1; }
        }
        return -1;
    }

    private int[] computePrefixFunction(String needle) {
        int[] pi = new int[needle.length()];
        int q = 0;
        for (int i = 1; i < needle.length(); i++) {
            while (q > 0 && needle.charAt(q) != needle.charAt(i)) {
                q = pi[q - 1];
            }
            if (needle.charAt(q) == needle.charAt(i)) { q++; }
            pi[i] = q;
        }
        return pi;
    }

}
