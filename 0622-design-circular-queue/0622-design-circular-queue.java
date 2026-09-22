class MyCircularQueue {
    private int[] q;
    private int f, r;
    private int size, capacity;

    public MyCircularQueue(int k) {
        f = r = -1;
        q = new int[k];
        size = 0;
        capacity = k;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        } else {
            if (f == -1) {
                f = 0;
            }
            r = (r + 1) % capacity;
            q[r] = value;
            size++;
            return true;
        }
    }
    
    public boolean deQueue() {
        if (isEmpty()) return false;
        if (f == r) {
            f = r = -1;
        } else {
            f = (f + 1) % capacity;
        }
        size--;
        return true;
    }
    
    public int Front() {
        if (!isEmpty()) return q[f];
        return -1;
    }
    
    public int Rear() {
        if (!isEmpty()) return q[r];
        return -1;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}