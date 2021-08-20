
// @Title: 杨辉三角 (Pascal's Triangle)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-20 23:02:28
// @Runtime: 0 ms
// @Memory: 36.3 MB

class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(temp);
        }
        return result;
    }

}
