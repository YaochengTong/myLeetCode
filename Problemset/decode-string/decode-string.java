
// @Title: 字符串解码 (Decode String)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-13 13:45:11
// @Runtime: 1 ms
// @Memory: 36.6 MB

class Solution {

    public int p = 0;

    public String decodeString(String s) {
        if (p == s.length() || s.charAt(p) == ']') { return ""; }
        String res = "";
        char c = s.charAt(p);
        if (Character.isDigit(c)) {
            int dupTimes = getDigits(s);
            p++;
            String str = decodeString(s);
            p++;
            for (int j = 0; j < dupTimes; j++) { res += str; }
        }
        if (Character.isLetter(c)) {
            res = String.valueOf(s.charAt(p));
            p++;
        }
        return res + decodeString(s);
    }

    private int getDigits(String s) {
        int dupTimes = 0;
        while (p < s.length() && Character.isDigit(s.charAt(p))) {
            dupTimes = dupTimes * 10 + s.charAt(p) - '0';
            p++;
        }
        return dupTimes;
    }

}
