
// @Title: 字符串中的第一个唯一字符 (First Unique Character in a String)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-05-07 00:04:04
// @Runtime: 30 ms
// @Memory: 38.9 MB

class Solution {

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < charArray.length; i++) {
            if (map.get(charArray[i]) == 1) { return i; }
        }
        return -1;
    }
    
}
