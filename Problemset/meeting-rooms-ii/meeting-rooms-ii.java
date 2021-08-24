
// @Title: 会议室 II (Meeting Rooms II)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-08-23 13:54:04
// @Runtime: 7 ms
// @Memory: 37.9 MB

class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) { return 0; }
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        Arrays.sort(intervals, (i, j) -> i[0] - j[0]);
        heap.add(intervals[0][1]);

        for (int i = 1; i < intervals.length; i++) {
            if (heap.peek() <= intervals[i][0]) {
                heap.remove();
            }
            heap.add(intervals[i][1]);
        }
        return heap.size();
    }
}
