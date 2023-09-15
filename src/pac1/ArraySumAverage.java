package pac1;
import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in представляет стандартный входной поток в Java

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size]; // new int[size] - это операция создания нового массива

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Введите число: ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Сумма элементов: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}

