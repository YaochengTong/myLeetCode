
// @Title: 反转字符串中的单词 III (Reverse Words in a String III)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-21 00:08:06
// @Runtime: 7 ms
// @Memory: 38.9 MB

class Solution {

    public String reverseWords(String s) {
        String[] stringArray = s.split(" ");
        for(int i = 0; i < stringArray.length; i++) {
            stringArray[i] = reverseString(stringArray[i]);
        }
        return String.join(" ", stringArray);
    }

    private String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int p1 = 0, p2 = charArray.length - 1;
        while (p1 < p2) {
            char temp = charArray[p1];
            charArray[p1] = charArray[p2];
            charArray[p2] = temp;
            p1++;
            p2--;
        }
        return new String(charArray);
    }

}
