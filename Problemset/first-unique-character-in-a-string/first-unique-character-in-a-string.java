
// @Title: 字符串中的第一个唯一字符 (First Unique Character in a String)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-08-23 11:31:51
// @Runtime: 4 ms
// @Memory: 38.6 MB

class Solution {

    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) { arr[s.charAt(i) - 'a']++; }
        for (int i = 0; i < n; i++) {
            if (arr[s.charAt(i) - 'a'] == 1) { return i; }
        }
        return -1;
    }
    
}
