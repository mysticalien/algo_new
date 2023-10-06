package pac2;

public class ReverseArray {
    public static void main(String[] args) {
        // исходный массив
        String[] array = {"один", "два", "три", "четыре", "пять"};

        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            String temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }

        // Вывод массива после обмена элементов
        for (String element : array) {
            System.out.println(element);
        }
    }
}
