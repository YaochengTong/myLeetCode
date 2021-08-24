
// @Title: 单词规律 (Word Pattern)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-08-23 11:01:43
// @Runtime: 1 ms
// @Memory: 36 MB

class Solution {

    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) { return false; }

        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            if (map.containsKey(c) && !map.get(c).equals(word)) { return false; }
            if (!map.containsKey(c) && set.contains(word)) { return false; }

            map.put(c, word);
            set.add(word);
        }

        return true;
    }

}
