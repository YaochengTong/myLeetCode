
// @Title: 根据字符出现频率排序 (Sort Characters By Frequency)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-08-23 10:22:32
// @Runtime: 11 ms
// @Memory: 39.2 MB

class Solution {

    public String frequencySort(String s) {
        char[] charArray = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        // record frequency in HashMap
        for (char c : charArray) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Iterating map key to ArrayList
        List<Character> list = new ArrayList<Character>(map.keySet());
        list.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return map.get(o2) - map.get(o1);
            }
        });
        // StringBuilder
        StringBuilder builder = new StringBuilder();
        for (char c : list) {
            int frequency = map.get(c);
            for (int j = 0; j < frequency; j++) { builder.append(c); }
        }
        return builder.toString();
    }
    
}
