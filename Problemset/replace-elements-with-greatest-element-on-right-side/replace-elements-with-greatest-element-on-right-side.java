
// @Title: 将每个元素替换为右侧最大元素 (Replace Elements with Greatest Element on Right Side)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-10 02:39:54
// @Runtime: 2 ms
// @Memory: 39.3 MB

class Solution {

    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        if (arr.length == 0) { return res; }
        res[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            res[i] = Math.max(res[i + 1], arr[i + 1]);
        }
        return res;
    }
    
}
