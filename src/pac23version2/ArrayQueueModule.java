package pac23version2;
public class ArrayQueueModule {
    private static final ArrayQueue queue = new ArrayQueue();

    // предусловие: элемент, который добавляется, не равен null
    // постусловие: размер очереди увеличивается на 1
    public static void enqueue(Object element) {
        queue.enqueue(element);
    }

    // предусловие: очередь не пуста
    // постусловие: состояние очереди не изменяется
    public static Object element() {
        return queue.element();
    }

    // предусловие: очередь не пуста
    // постусловие: размер очереди уменьшается на 1
    public static Object dequeue() {
        return queue.dequeue();
    }

    // предусловие: отсутствует
    // постусловие: возвращает текущий размер очереди
    public static int size() {
        return queue.size();
    }

    // предусловие: отсутствует
    // постусловие: возвращает true, если очередь пуста, и false в противном случае
    public static boolean isEmpty() {
        return queue.isEmpty();
    }

    // предусловие: отсутствует
    // постусловие: очередь становится пустой
    public static void clear() {
        queue.clear();
    }
}
