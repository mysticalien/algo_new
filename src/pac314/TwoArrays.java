package pac314;

import java.util.Random;
import java.util.Scanner;
public class TwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        while (n <= 0) {
            System.out.println("Введите размер массива (натуральное число больше 0):");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Число должно быть натуральным и больше нуля!");
                }
            } else {
                System.out.println("Неккоректный ввод!");
                scanner.next();
            }
        }

        int[] originalArray = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            originalArray[i] = random.nextInt(n + 1);
        }

        System.out.println("Исходный массив:");
        printArray(originalArray);

        int[] evenArray = getEvenElements(originalArray);

        if (evenArray.length > 0) {
            System.out.println("Массив из четных элементов:");
            printArray(evenArray);
        } else {
            System.out.println("В исходном массиве нет четных элементов.");
        }
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.println(number + " ");
        }
        System.out.println();
    }

    public static int[] getEvenElements(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }

        int[] evenArray = new int[count];
        int index = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                evenArray[index] = number;
                index++;
            }
        }

        return evenArray;
    }
}
