package pac3;
import java.util.Arrays;
import java.util.Random;

public class RandomArraySorting {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int arraySize = 10;
        double[] randomArray1 = generateRandomArrayUsingMath(arraySize);
        double[] randomArray2 = generateRandomArrayUsingRandomClass(arraySize);

        System.out.println("Массив, сгенерированный с использованием Math.random():");
        printArray(randomArray1);

        System.out.println("\nМассив, сгенерированный с использованием класса Random:");
        printArray(randomArray2);

        Arrays.sort(randomArray1);
        Arrays.sort(randomArray2);

        System.out.println("\nОтстортированный массив с использованием Math.random():");
        printArray(randomArray1);

        System.out.println("\nОтстортированный массив с использованием класса Random:");
        printArray(randomArray2);
    }

    private static double[] generateRandomArrayUsingMath(int size) {
        double[] array = new double [size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        return array;
    }

    private static double[] generateRandomArrayUsingRandomClass(int size) {
        double[] array = new double [size];
        for (int i = 0; i < size; i++) {
            array[i] = RANDOM.nextDouble();
        }
        return array;
    }

    private static void printArray(double[] array) {
        for (double value : array) {
            System.out.println(value);
        }
    }
}
