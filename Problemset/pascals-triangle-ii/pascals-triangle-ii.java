
// @Title: 杨辉三角 II (Pascal's Triangle II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-20 23:52:26
// @Runtime: 0 ms
// @Memory: 36.1 MB

class Solution {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < rowIndex + 1; i++) {
            if (i == 0 || i == rowIndex) {
                result.add(1);
            } else {
                long value = (long) result.get(i - 1) * (rowIndex - i + 1) / i;
                result.add((int) value);
            }
        }
        return result;
    }

}
