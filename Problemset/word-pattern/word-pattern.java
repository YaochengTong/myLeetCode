
// @Title: 单词规律 (Word Pattern)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-05-07 02:41:55
// @Runtime: 1 ms
// @Memory: 36.4 MB

class Solution {

   public boolean wordPattern(String pattern, String s) {
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length) { return false; }

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < strs.length; i++) {
            char c = pattern.charAt(i);
            String str = strs[i];
            if (map.containsKey(c) && !map.get(c).equals(str)) { return false; }
            if (!map.containsKey(c) && set.contains(str)) { return false; }
            map.put(c, str);
            set.add(str);
        }
        return true;
    }

}
