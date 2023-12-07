package pac23version2;
public class ArrayQueueADT {
    private ArrayQueue queue;

    public ArrayQueueADT() {
        this.queue = new ArrayQueue();
    }

    public void enqueue(Object element) {
        queue.enqueue(element);
    }

    public Object element() {
        return queue.element();
    }

    public Object dequeue() {
        return queue.dequeue();
    }

    public int size() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void clear() {
        queue.clear();
    }
}

