
// @Title: 根据字符出现频率排序 (Sort Characters By Frequency)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-05-07 03:38:26
// @Runtime: 13 ms
// @Memory: 39.3 MB

class Solution {
    public String frequencySort(String s) {
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Character>[] buckets = new List[s.length() + 1];

        for (char c : map.keySet()) {
            int value = map.get(c);
            if (buckets[value] == null) {
                buckets[value] = new ArrayList<Character>();
            }
            buckets[value].add(c);
        }
        StringBuilder res = new StringBuilder();
        for (int i = buckets.length - 1; i > 0; i--) {
            if (buckets[i] != null) {
                for (char c : buckets[i]) {
                    for (int k = i; k > 0; k--) { res.append(c); }
                }
            }
        }
        return res.toString();
    }
}
