
// @Title: 会议室 II (Meeting Rooms II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-05-07 03:09:57
// @Runtime: 9 ms
// @Memory: 38.4 MB

class Solution {

    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) { return 0; }
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
        Arrays.sort(intervals, (i, j) -> i[0] - j[0]);
        queue.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            if (queue.peek() <= intervals[i][0]) { queue.remove(); }
            queue.add(intervals[i][1]);
        }
        return queue.size();
    }

}
