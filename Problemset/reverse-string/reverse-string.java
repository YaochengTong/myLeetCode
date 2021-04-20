
// @Title: 反转字符串 (Reverse String)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-19 23:54:52
// @Runtime: 1 ms
// @Memory: 44.8 MB

class Solution {

    public void reverseString(char[] s) {
        int p1 = 0, p2 = s.length - 1;
        while (p1 < p2) {
            swap(s, p1++, p2--);
        }
    }

    private void swap(char[] s, int a, int b) {
        char temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }

}

