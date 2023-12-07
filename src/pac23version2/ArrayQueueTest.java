package pac23version2;
public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);

        int firstElement = (int) ArrayQueueModule.element(); // ожидаемый результат: 1
        System.out.println(firstElement);

        int removedElement = (int) ArrayQueueModule.dequeue(); // ожидаемый результат: 1
        System.out.println(removedElement);

        int size = ArrayQueueModule.size(); // ожидаемый результат: 1
        System.out.println(size);

        boolean isEmpty = ArrayQueueModule.isEmpty(); // ожидаемый результат: false
        System.out.println(isEmpty);


        ArrayQueueModule.clear();
        
    }
}
