
// @Title: 数据流的中位数 (Find Median from Data Stream)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-04-11 21:02:36
// @Runtime: 68 ms
// @Memory: 49.7 MB

class MedianFinder {

    /** initialize your data structure here. */
    private int totalNums;
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        totalNums = 0;
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((x,y)->y-x);
    }
    
    public void addNum(int num) {
        totalNums++;
        maxHeap.add(num);
        minHeap.add(maxHeap.poll());
        if (totalNums % 2 != 0) {
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if (totalNums % 2 == 0) {
            return (double) (maxHeap.peek()+minHeap.peek())/2;
        } else {
            return (double) maxHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
