
// @Title: 可获得的最大点数 (Maximum Points You Can Obtain from Cards)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-08-27 09:17:52
// @Runtime: 2 ms
// @Memory: 45.9 MB

class Solution {

    public int maxScore(int[] cardPoints, int k) {

        // boundry condition
        if ( k <= 1 && cardPoints.length < 2) { return -1; }
        
        // Prefix/Post Sum array
        int[] preSum = new int[k + 1];
        int[] postSum = new int[k + 1];

        preSum[0] = 0;
        postSum[0] = 0;

        for (int i = 0; i < k; i++) {
            preSum[i + 1] = preSum[i] + cardPoints[i];
            postSum[i + 1] = postSum[i] + cardPoints[cardPoints.length - 1 - i];
        }

        int result = 0;

        // becareful this is i < k + 1, preSum included 0 element
        for (int i = 0; i < k + 1; i++) {
            int sum = preSum[i] + postSum[k - i];
            result = Math.max(result,sum);
        }

        return result;
    }

}
