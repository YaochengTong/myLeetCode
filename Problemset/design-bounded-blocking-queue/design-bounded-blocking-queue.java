
// @Title: 设计有限阻塞队列 (Design Bounded Blocking Queue)
// @Author: tongyaocheng@gmail.com
// @Date: 2021-08-25 09:48:04
// @Runtime: 10 ms
// @Memory: 38.7 MB

class BoundedBlockingQueue {

    private final int CAPACITY;
    private volatile int size = 0;
    private LinkedList<Integer> queue = new LinkedList<Integer>();
    private static ReentrantLock lock = new ReentrantLock();
    Condition producer = lock.newCondition();
    Condition consumer = lock.newCondition();

    public BoundedBlockingQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    public void enqueue(int element) throws InterruptedException {
        lock.lock();
        try {
            while (size == CAPACITY) { producer.await(); }
            queue.addFirst(element);
            size++;
            consumer.signal();
        } finally {
            lock.unlock();
        }
    }

    public int dequeue() throws InterruptedException {
        lock.lock();
        try {
            while (size == 0) { consumer.await(); }
            int lastValue = queue.getLast();
            queue.removeLast();
            size--;
            producer.signal();
            return lastValue;
        } finally {
            lock.unlock();
        }
    }

    public int size() {
        return this.size;
    }

}
