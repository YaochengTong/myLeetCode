
// @Title: 竖直打印单词 (Print Words Vertically)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-18 15:37:47
// @Runtime: 1 ms
// @Memory: 36.5 MB

class Solution {

    public List<String> printVertically(String s) {
        List<String> result = new ArrayList<>();
        String[] words = s.split(" ");

        // Find the maximum length for result size
        int resultSize = 0;
        for (String w : words) {
            if (w.length() > resultSize) { resultSize = w.length(); }
        }

        // Build result
        for (int i = 0; i < resultSize; i++) {
            StringBuilder sb = new StringBuilder();
            for (String w : words) {
                sb.append(w.length() > i ? w.charAt(i) : " ");
            }
            // removing trailing spaces
            // if (sb.length() < 1) { break; }
            while (sb.charAt(sb.length() - 1) == ' ') { sb.deleteCharAt(sb.length() - 1); }
            result.add(sb.toString());
        }

        return result;
    }

}
